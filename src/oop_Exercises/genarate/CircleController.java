package oop_Exercises.genarate;

import oop_Exercises.genarate.Circle;

public class CircleController {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1.toString());
        Circle c2=new Circle(2,"yellow");
        System.out.println(c2.toString());
    }
}
