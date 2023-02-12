package oop_Exercises.strategy;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehaviour=new Quack();
        }
    }

