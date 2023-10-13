/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproyecto1;

/**
 *
 * @author Esteban
 */
public abstract class Defensive extends Entity {
    /*
    Attributes
    */
    private int hitDamage;
    private int hitsPerSeconds;
    private int lvl;
    
    /*
    Constructor, setters and getters
    */

    public Defensive(int hitDamage, int hitsPerSeconds, int lvl, String name, int healthPts, int areaOnGrid, String imageAlive, String imageDead) {
        super(name, healthPts, areaOnGrid, imageAlive, imageDead);
        this.hitDamage = hitDamage;
        this.hitsPerSeconds = hitsPerSeconds;
        this.lvl = lvl;
    }

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }

    public int getHitsPerSeconds() {
        return hitsPerSeconds;
    }

    public void setHitsPerSeconds(int hitsPerSeconds) {
        this.hitsPerSeconds = hitsPerSeconds;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    /*
    Methods
    */
    public abstract void attack();
}
