package oop_Exercises.abstraction;

public class Invoice {
    public static void main(String [] args) {
        RentalCost a = new RentalCost("11DA", "Honda CRV", 50.00, 4.5);
        System.out.println("mailInvoice() called using Cost as reference");
        a.mailInvoice();
        System.out.println("\n\nCalling method computeCost() from abstract 'Car class' that's implemented in concrete 'Cost class'");
        a.computeCost();
    }
}
