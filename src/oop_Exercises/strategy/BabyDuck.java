package oop_Exercises.strategy;

public class BabyDuck extends Duck{
    public BabyDuck() {
         quackBehaviour=new Sqeak();
    }
}
