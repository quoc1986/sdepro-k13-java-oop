package oop_Exercises.abstraction;

public abstract class Car {
        private String name;
        private String regNumber;
        private int number;

    public Car(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }
    public void mailInvoice(){
        System.out.println("Mailing an invoice for: " + this.name + " Registration: " + this.regNumber);
    }
    public String toString(){
        return name +" "+regNumber;
    }
    public String getName(){
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }
    public abstract void computeCost();
}
