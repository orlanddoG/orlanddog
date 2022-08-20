import java.util.Scanner;

public class Circle {

    //Define Variables
    private double Radio;
    double Area;

    //Set radius with default value of 1.0
    public Circle() {
        Radio = 1.0;
    }

    //Accepts an argument for the radius
    public Circle(double Radio) {
        this.Radio = Radio;
    }

    //Sets radius
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    //Gets radius
    public void getRadio(double Radio) {
        this.Radio = Radio;
    }

    //Finds the Area
    public double getArea(double Area) {
        double PI = 3.1416;
        Area = PI * Radio * Radio;
        return Area;
    }

    public static void main(String[] args) {
        double Area, Radio;

        Scanner Input = new Scanner(System.in);

        //The User enters the radius
        System.out.println("Ingrese el valor de el Radio");
        Radio = Input.nextDouble();

        Circle myCircle = new Circle(Radio);
        Area = myCircle.getArea(Radio);

        //Prints the radius
        System.out.print("El valor del Area es igual a: " + Area);
    }
}
