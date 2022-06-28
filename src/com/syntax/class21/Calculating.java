package com.syntax.class21;
//Create 1 class in which create a methods that will calculate the area (volume in case of box) of:
//Rectangle,Square, Box
//Use separate class to test your code
public class Calculating {

  static void multiply(double number1) {
    System.out.println("Area of square: " + number1 * number1);
  }

  static void multiply(double number1, double number2) {
    System.out.println("Area of rectangle: " + number1 * number2);
  }

  static void multiply(double number1, double number2, double number3) {
    System.out.println("Volume of box: " + number1 * number2 * number3);
  }
}
   class TestArea{
    public static void main(String[] args) {
      Calculating calculate = new Calculating();
      calculate.multiply(5);
      calculate.multiply(5, 10);
      calculate.multiply(10, 5, 15);

      }
    }


