public class TestCircle {

    public static void main(String[] args) {
        // Declare an instance of Circle class called circle1
        // Invoke the default constructor
        Circle circle1 = new Circle();
        // invoke public methods
        System.out.println("The circle has radius of" + circle1.getRadius() + "and area of" + circle1.getArea());
        //declare an instance of Circle class called circle2
        // invoke the second constructor
        Circle circle2 = new Circle(8);
        // invoke public methods
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " +
                circle2.getArea());


        Circle circle3 = new Circle(6, "PINK");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Radus :" + circle3.getRadius() +" "+"Area :" + circle3.getArea() + "; color : " + circle3.getColour());

        circle3.setRadius(34);
        circle3.setColour("PURPLE");

        System.out.println("Radus : " + circle3.getRadius() + " Area : "
                + circle3.getArea() + " color : " + circle3.getColour());

    }
}
