package com.avenuecode.controllers;

import com.avenuecode.domain.Image;
import com.avenuecode.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cod- on 7/6/2017.
 */
@RestController
@RequestMapping("/images")
public class ImageController {

    private ImageService imageService;

    @Autowired
    public void setImageService(ImageService imageService) { this.imageService = imageService; }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Image> list(Image image){
        return imageService.listImages();

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Image getImageById(@PathVariable("id") Integer id) {
        return imageService.getImageById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Image newImage(@RequestBody Image image) {
        return imageService.saveImage(image);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.POST)
    public Image updateImage(@RequestBody Image image) {
        return imageService.saveImage(image);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteImage(@PathVariable("id") Integer id) {
        imageService.deleteImage(id);
    }

}
