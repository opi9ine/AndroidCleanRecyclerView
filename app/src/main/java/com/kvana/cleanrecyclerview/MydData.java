package com.kvana.cleanrecyclerview;

/**
 * Created by kris9 on 12/3/16.
 */
public class MydData {

    int id;
    String description, image_link;

    public MydData(int id, String description, String image_link) {
        this.id = id;
        this.description = description;
        this.image_link = image_link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }
}
