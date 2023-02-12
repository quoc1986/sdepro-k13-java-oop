package oop_Exercises.genarate;

public class Circle {
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() {
        radius=1.0;
        color="red";
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
