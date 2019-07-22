package com.Patterns.Decorator;

public class DecoratorPatternDemo
{

  public static void main(String[] args)
  {

    Shape circle = new Circle();
    Shape rectangle = new Rectangle();

    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("\nCircle with red border");
    Shape redCircle = new RedShapeDecorator(new Circle());
    redCircle.draw();


    System.out.println("\nRectangle with normal border");
    rectangle.draw();

    System.out.println("\nRectangle with red border");
    Shape redRectangle = new RedShapeDecorator(new Rectangle());
    redRectangle.draw();


  }



}
