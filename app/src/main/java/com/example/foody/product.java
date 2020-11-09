package com.example.foody;

public class product {
    String text;
    Integer image;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public product(String text, Integer image) {
        this.text = text;
        this.image = image;
    }
}
