package oop_Exercises.strategy;

public class TestDuck {
    void performanceQuackBehavior(Duck duck){
        duck.performQuackBehavior();
    }

    public static void main(String[] args) {
        Duck mallardDuck=new MallardDuck();
        Duck babyDuck=new BabyDuck();
        babyDuck.changeQuackBehavior(new Quack());

        TestDuck testDuck=new TestDuck();
        testDuck.performanceQuackBehavior(mallardDuck);
        testDuck.performanceQuackBehavior(babyDuck);
    }
}
//Class Duck, Squeak -> detailed implement behavior of QuackBehaivor
//MallardDuck -> a type of Duck
