/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproyecto1;

/**
 *
 * @author Esteban
 */
public abstract class Entity {
    
    /*
    Attributes
    */
    private String name;
    private int healthPts;
    private int areaOnGrid;
    private String imageAlive;
    private String imageDead;
    protected boolean alive = true;
    
    /*
    Constructor, Getter´s and Setter´s
    */
    public Entity(String name, int healthPts, int areaOnGrid, String imageAlive, String imageDead) {
        this.name = name;
        this.healthPts = healthPts;
        this.areaOnGrid = areaOnGrid;
        this.imageAlive = imageAlive;
        this.imageDead = imageDead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPts() {
        return healthPts;
    }

    public void setHealthPts(int healthPts) {
        this.healthPts = healthPts;
    }

    public int getAreaOnGrid() {
        return areaOnGrid;
    }

    public void setAreaOnGrid(int areaOnGrid) {
        this.areaOnGrid = areaOnGrid;
    }

    public String getImageAlive() {
        return imageAlive;
    }

    public void setImageAlive(String imageAlive) {
        this.imageAlive = imageAlive;
    }

    public String getImageDead() {
        return imageDead;
    }

    public void setImageDead(String imageDead) {
        this.imageDead = imageDead;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    

    /*
    Methods
     */
    public abstract void death();
    public abstract void movement();
    
}
