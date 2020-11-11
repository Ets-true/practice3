package com.company;

public class Hand {
    private int health;
    private int agility;
    Hand(int health, int agility){
        this.health = health;
        this.agility =agility;
    }
    public int getHealth(int health){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAgility(int agility) {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "health=" + health +
                ", agility=" + agility +
                '}';
    }
}

