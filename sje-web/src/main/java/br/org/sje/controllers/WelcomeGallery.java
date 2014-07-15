package br.org.sje.controllers;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by drferreira on 15/07/14.
 */
@ViewScoped
@Named
public class WelcomeGallery implements Serializable {

    private List<String> galleryImages;

    @PostConstruct
    public void setUp(){
        galleryImages = new ArrayList<>();
        galleryImages.add("ar_conditioner.png");
        galleryImages.add("installation.jpg");
        galleryImages.add("split.jpg");
    }

    public List<String> getGalleryImages() {
        return galleryImages;
    }
}
