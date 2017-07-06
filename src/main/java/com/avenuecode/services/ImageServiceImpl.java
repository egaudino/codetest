package com.avenuecode.services;

import com.avenuecode.domain.Image;
import com.avenuecode.repositories.ImageRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cod- on 7/6/2017.
 */
@Service
public class ImageServiceImpl implements ImageService {

    private ImageRepository imageRepository;

    @Autowired
    public void setImageRepository(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Iterable<Image> listImages() {
        return imageRepository.findAll();
    }

    @Override
    public Image getImageById(Integer id) {
        return imageRepository.findOne(id);
    }

    @Override
    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public void deleteImage(Integer id) {
        imageRepository.delete(id);
    }
}
