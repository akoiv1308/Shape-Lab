import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in); 
    System.out.println("Enter a shape you want me to execute :)\nCircle, Square, Rectangle, Triangle, Trapezoid");
    String shape = userInput.nextLine();
    shape = shape.toLowerCase();
      if(shape.equals("circle")){
        System.out.println("Circle! Enter radius: ");
        double radius = userInput.nextDouble();
        System.out.println("The area is " + circle(radius));
        System.out.println("The perimeter is " + circumference(radius));
      }
      else if(shape.equals("square")) {
        System.out.println("Square! Enter one side: ");
        double side = userInput.nextDouble();
        System.out.println("The area is " + quadrilateral(side));
        System.out.println("The perimeter is " + perimeterS(side));
        for(int k = 0; k<side; k++) {
          for(int i = 0; i<side; i++) {
          System.out.print("*");
        }
        System.out.println();
        }
      }
      else if(shape.equals("rectangle")) {
        System.out.println("Rectangle! Enter length and width by pressing enter to seperate the values: ");
        double length = userInput.nextDouble();
        double width = userInput.nextDouble();
        System.out.println("The area is " + quadrilateral(length, width));
        System.out.println("The perimeter is " + perimeterR(length, width));
      }
      else if(shape.equals("triangle")) {
        System.out.println("Triangle! Enter length and width by pressing enter to seperate the values: ");
        double length = userInput.nextDouble();
        double width = userInput.nextDouble();
        System.out.println("The area is " + triangle(length, width));
      }
      else if(shape.equals("trapezoid")) {
        System.out.println("Trapezoid! Enter height, base one and base two by pressing enter to seperate the values: ");
        double height = userInput.nextDouble();
        double base1 = userInput.nextDouble();
        double base2 = userInput.nextDouble();
        System.out.println("The area is " + quadrilateral(height, base1, base2));
      }
      else {
        System.out.print("Invalid Input");
      }
      userInput.close();
    }
                              //Areas//
  //square//
  public static double quadrilateral(double side) {
    double area = side*side;
    return area;
  }
  //rectangle//
  public static double quadrilateral(double length, double width) {
    double area = length*width;
    return area;
  }
  public static double triangle(double length, double width) {
    double area = (length*width)/2;
    return area;
  }
  public static double circle(double radius) {
    double area = Math.PI*Math.pow(radius,2);
    return area;
  }
  //trapezoid//
  public static double quadrilateral(double height, double base1, double base2) {
    double area = height*((base1+base2)/2);
    return area;
  }
                            //Perimeters//
  public static double circumference(double radius) {
    double result = 2*Math.PI*radius;
    return result;
  }
  public static double perimeterS(double side) {
    double perimeter = side*4;
    return perimeter;
  }
  public static double perimeterR(double length, double width) {
    double perimeter = (length+width)*2;
    return perimeter;
  }
}