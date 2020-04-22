
import java.util.*;

class Circle {

    final double PI = 3.14;

    double radius;



    public Circle() {

        radius = 1.0;

    }



    Circle(double radius) {

        this.radius = radius;

    }



    void area() {

        System.out.println("Area is " + (PI * radius * radius));

    }



    void circumference() {

        System.out.println("Circumference is " + (2 * PI * radius));

    }



    void display() {

        System.out.println("Raduis is " + radius);

        area();

        circumference();

    }

}



public class CircleTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Default radius of circle2 : 1");

        System.out.print("Enter the radius of a circle2 : ");

        double radius = input.nextDouble();



        Circle circle1 = new Circle();

        Circle circle2 = new Circle(radius);

        circle1.display();

        circle2.display();

    }

}