/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproyecto1;

/**
 *
 * @author Esteban
 */
public class Melee extends Defensive{
    
    /*
    Cosntructors, setters and getters
    */
    public Melee(int hitDamage, int hitsPerSeconds, int lvl, String name, int healthPts, int areaOnGrid, String imageAlive, String imageDead) {    
        super(hitDamage, hitsPerSeconds, lvl, name, healthPts, areaOnGrid, imageAlive, imageDead);
        //TODO
    }

    /*
    Methods
     */
    @Override
    public void attack() {
        //TODO
    }
    
    @Override
    public void death() {
        if (alive){
            alive =  false;
        }
    }
    
    @Override
    public void movement() {
        //TODO
    }
}
