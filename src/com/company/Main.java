package com.company;

    public class Main {
        public static void main(String[] args) {

            Head head_setter = new Head("long", "blonde", "green");
            Leg leg_setter = new Leg("jeans");
            Hand hand_setter = new Hand("T-shirt", "classic");
            Human all_setter = new Human(head_setter, leg_setter, hand_setter);

            System.out.println("\n" + all_setter);




            Head Man_Head = new Head();
            Leg Man_Leg = new Leg();
            Hand Man_Hand = new Hand();
            Human Man = new Human();


            // Тестируем класс Head
            Man_Head.setHaircut("short");
            Man_Head.setHair_color("fair-haired");
            Man_Head.setEye_color("blue");
            System.out.println("Haircut: " + Man_Head.getHaircut());
            System.out.println("Hair color: " + Man_Head.getHair_color());
            System.out.println("Eye color: " + Man_Head.getEye_color());
            Man_Head.setHaircut("short");
            Man_Head.setHair_color("black");


            //Тестируем класс leg
            Man_Leg.setClothing("fair-haired");
            System.out.println("Leg clothing: " + Man_Leg.getClothing());


            //Тестируем класс hand
            Man_Hand.setClothing("shirt");
            Man_Hand.setClock("galaxy gear");
            System.out.println("Hand clothing: " + Man_Hand.getClothing());
            System.out.println("Hand clock: " + Man_Hand.getClock());


            // Linking the components
            Man.setHead(Man_Head);
            Man.setLeg(Man_Leg);
            Man.setHand(Man_Hand);


            // Summarize
            System.out.println("\nHuman:");
            System.out.println(Man);
        }
}
