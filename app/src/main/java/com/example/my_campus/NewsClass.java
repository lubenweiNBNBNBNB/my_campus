package com.example.my_campus;

public class NewsClass {
    private String name;
    private int imageId;

    public NewsClass(String name)
    {
        this.name = name;
        //this.imageId = imageId;
    }
    public String getName(){return name;}
    public int getImageId(){return imageId;}
}
