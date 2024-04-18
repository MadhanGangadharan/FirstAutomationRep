package org.example.secondpackage;

import org.example.oopsconcept.*;

public class Practiseinheritance extends how{
    public int multiplyTwoNumbers(int a,int b){
        int c =a*b;
        return c;
    }
    @Override
    public void run() {
        super.run();
        System.out.println("Successfully called super class");
    }
    public void testingMethodOverloading(int score){
        System.out.println("FirstMethod in MethodOverloading"+score);
    }
    public void testingMethodOverloading(int score,String a){
        System.out.println("SecondMethod in MethodOverloading"+(score+a));

    }
    public static void staticMethod(){
        System.out.println("Entered Static Method");

    }
}