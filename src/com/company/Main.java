package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rhombus myGarden=new Rhombus(5,10,12);

        System.out.println(" Rhombus Square = " + myGarden.getArea());
        System.out.println(" Rhombus Perimeter = " + myGarden.getPerimeter());
        System.out.println( " Radius circle inscribed in a rhombus = "+ myGarden.getRadius());
        System.out.println( " Sin(a) = " + myGarden.getSinAngle());
        System.out.println( " Diagonal Rhombus = " + myGarden.getDiagonal_2());


    }
}
