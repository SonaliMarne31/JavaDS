package Implement;

public class Circle implements Shape {

    private int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I am circle -- draw ");
        
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public int getRadius() {
        return this.radius;
    }
    
    
}
