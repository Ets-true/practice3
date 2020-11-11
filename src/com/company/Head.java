package com.company;

public class Head {
    private int health;
    private int brainpower;

     Head(int health, int brainpower){
         this.health = health;
         this.brainpower = brainpower;
     }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBrainpower() {
        return brainpower;
    }

    public void setBrainpower(int brainpower) {
        this.brainpower = brainpower;
    }

    @Override
    public String toString() {
        return "Head{" +
                "health=" + health +
                ", brainpower=" + brainpower +
                '}';
    }
}