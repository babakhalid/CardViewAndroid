package com.khalidbaba.cardview;

/**
 * Created by khalidbaba on 31/01/2018.
 */

public class Product {
    private String text;
    private String imageUrl;

    public Product(String text, String imageUrl) {
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
