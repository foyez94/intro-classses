package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Ball myBall =new Ball();
    Ball SecondBall=new Ball();

    SecondBall.name="soccer ball";
    SecondBall.color="brown";

    myBall.color="blue";
    myBall.name="BasketBall";


    System.out.println(myBall.name);
    System.out.println(SecondBall.color);
    }
}
