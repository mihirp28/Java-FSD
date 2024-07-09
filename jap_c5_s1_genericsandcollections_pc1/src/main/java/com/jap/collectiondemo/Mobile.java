package com.jap.collectiondemo;

public class Mobile {

    private String brandName;
    private String modelName;
    private double cost;
    private String screenSize;
    private String batteryLife;
    private String storageSpace;
    private int cameraPixels;
    public Mobile(String brandName, String modelName, double cost, String screenSize, String batteryLife,
                  String storageSpace, int cameraPixels) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.cost = cost;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        this.storageSpace = storageSpace;
        this.cameraPixels = cameraPixels;
    }

    //getter and setter

    //constructor

    //toString method
    public String toString() {
        return "Brand: "+brandName+", Model: "+modelName+", Cost: "+cost+", Screen: "+screenSize+", Battery: "+batteryLife+", Storage: "+storageSpace+", Camera: "+cameraPixels;
    }
}