package com.Patterns.Prototype;

public class Square extends Shape
{
  public Square()
  {
    type = "Square";
  }


  @Override protected void draw()
  {
    System.out.println("Inside Square: draw() method");
  }
}
