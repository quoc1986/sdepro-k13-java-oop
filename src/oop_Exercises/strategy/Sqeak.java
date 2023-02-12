package oop_Exercises.strategy;

public class Sqeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak Squeak!!!!");
    }
}
