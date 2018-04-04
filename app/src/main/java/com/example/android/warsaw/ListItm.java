package com.example.android.warsaw;

public class ListItm {

    private String name;
    private String description;
    private int image;

    public ListItm (String theName, String theDescription, int theImage) {
        name = theName;
        description = theDescription;
        image = theImage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

}