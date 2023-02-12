package oop_Exercises.abstraction;

public class RentalCost extends Car{
    private double costPerHour;
    private double hours;
    private double cost;
    public RentalCost(String regNumber, String name, double costPerHour, double hours) {
        super(regNumber, name);
        setCost(costPerHour, hours);
    }
    public void mailInvoice() {
        System.out.println("Mailing invoice for " + getName() + " with amount due as " + cost);
    }
    public double getCostPerHour() {
        return costPerHour;
    }
    public double getHours() {
        return hours;
    }
    public void setCost(double newCost, double newHours) {
        if(newCost >= 0.0 && newHours>=0.0) {
            costPerHour = newCost;
            hours = newHours;
            cost = costPerHour * hours;
        }
    }
    public void computeCost() {
        System.out.println("Total cost for:" + getName() + " is " + cost);
    }
}
