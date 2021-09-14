package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static final double conversion=0.09290304;
    public static void main( String[] args )
    {
        int length;
        int width;

        System.out.print("What is the length of the room in feet? ");

        Scanner input=new Scanner(System.in);
        length=input.nextInt();

        System.out.print("What is the width of the room in feet? ");

        Scanner input2=new Scanner(System.in);
        width=input2.nextInt();

        System.out.print("You entered dimensions of "+(length)+" feet by "+(width)+" feet.\n");

        int area=length*width;
        double meter_area=area*conversion;

        System.out.print("The area is\n" + (area)+ " square feet\n");
        System.out.format("%.3f", meter_area);
        System.out.print(" square meters");


    }
}


