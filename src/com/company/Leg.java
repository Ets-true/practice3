package com.company;

public class Leg {

    private int health;
    private int strength;
    Leg(int health, int strength){
        this.health = health;
        this.strength = strength;
    }
    public int getHealth(int health){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "health=" + health +
                ", strength=" + strength +
                '}';
    }
}
