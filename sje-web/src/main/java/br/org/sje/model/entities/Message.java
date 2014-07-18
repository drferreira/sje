package br.org.sje.model.entities;

import java.io.Serializable;

/**
 * Created by drferreira on 18/07/14.
 */
public class Message implements Serializable{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
