public class Circle {

    // private instance variables, not accessible from outside the class
    private String colour;
    private double radius;

    // default constructor with no arguments
    public Circle() {
        radius = 1;
        colour = "blue";


    }
// second constructor takes as argument the radius but has default colour

    public Circle(double r) {
        radius = r;
        colour = "blue";

    }

    // public method to retrieve the radius
    public double getRadius() {
        return radius;
    }

    // public method to compute and return the area of circle
    public double getArea() {
        return (Math.round(radius * radius * Math.PI));
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.colour = c;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setColour(String newColour) {
        colour = newColour;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "colour='" + colour + '\'' +
                ", radius=" + radius +
                '}';
    }
}
