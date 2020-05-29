package com.company;

public class Ball {//blueprint
    //properties or instance variables
    public String color;
    public String name;
    public int bounceRate;

  //Behaviors
    public void bounce(){
    System.out.println("Bouncing...");
}
    public void Deflate(){
        System.out.println("Deflating....");
    }
    public void inflate(){
        System.out.println("inflating...");
    }
}