package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius: ");
        Double radius = input.nextDouble();
        //Double pi = 3.14159265358979;
        System.out.println("Area: " + Circle.getArea(radius));
    }
}
