package lesson_11;

public interface ISomething {
    //Has relationship - fully abstraction
    void doSomething();

    default void doAnotherSomething(){};

    static void doAnything(){}
}
