package com.Patterns.Prototype;

public class PrototypePatternDemo
{

  public static void main(String[] args)
  {
    ShapeCache shapeCache = new ShapeCache();
    shapeCache.loadCache();

    Shape cloneShape1 = (Shape) shapeCache.getShape("1");
    System.out.println("Shape : " + cloneShape1.getType());
    cloneShape1.draw();

    Shape cloneShape2 = (Shape) shapeCache.getShape("2");
    System.out.println("Shape : " + cloneShape2.getType());
    cloneShape2.draw();

    Shape cloneShape3 = (Shape) shapeCache.getShape("3");
    System.out.println("Shape : " + cloneShape3.getType());
    cloneShape3.draw();



  }


}
