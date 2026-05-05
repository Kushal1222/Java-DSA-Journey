package com.kushal;
import java.util.*;


public class Months{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int button =sc.nextInt();
        switch(button){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("Feburary");
                break;
            case 3 :
                System.out.println("March");
                break;
            default :
                System.out.println("invalid choice");
                break;

        }

    }

}
