package com.avenuecode.services;

import com.avenuecode.domain.Image;

/**
 * Created by cod- on 7/6/2017.
 */
public interface ImageService {
    Iterable<Image> listImages();

    Image getImageById(Integer id);

    Image saveImage(Image product);

    void deleteImage(Integer id);
}
