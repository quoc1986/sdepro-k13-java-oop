package oop_Exercises.strategy;

public class Duck {
    QuackBehaviour quackBehaviour;
    public void performQuackBehavior(){
        quackBehaviour.quack();
    }
    public void changeQuackBehavior(QuackBehaviour quackBehaviour){
        this.quackBehaviour=quackBehaviour;
    }
}
