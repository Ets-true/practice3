package com.company;

public class Human {
    private Head head;
    private Leg leg;
    private  Hand hand;
    Human() {
         head = new Head(150,100);
        leg = new Leg(100,200);
        hand = new Hand(50, 250);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head.toString() +
                ", leg=" + leg.toString() +
                ", hand=" + hand.toString() +
                '}';
    }
}
