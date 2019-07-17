package com.Patterns.Prototype;

import java.util.Hashtable;

public class ShapeCache
{

  private static Hashtable<String, com.Patterns.Prototype.Shape> shapeMap = new Hashtable<>();


  public Shape getShape(String shapeId)
  {

    com.Patterns.Prototype.Shape cacheShape = shapeMap.get(shapeId);
    return (Shape) cacheShape.clone();

  }

  public void loadCache()
  {

    Circle circle = new Circle();
    circle.setId("1");
    shapeMap.put(circle.getId(), circle);

    Rectangle rectangle = new Rectangle();
    rectangle.setId("2");
    shapeMap.put(rectangle.getId(), rectangle);

    Square square = new Square();
    square.setId("3");
    shapeMap.put(square.getId(), square);

  }

}
