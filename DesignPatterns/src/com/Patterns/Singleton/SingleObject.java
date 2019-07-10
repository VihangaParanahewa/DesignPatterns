package com.Patterns.Singleton;

public class SingleObject
{

  private static SingleObject instance;

  public int num = 10;

  private SingleObject()
  {
  }

  public static SingleObject getInstance()
  {
    if(instance == null)
    {
      instance = new SingleObject();
    }
    return instance;
  }

  public void showMessage()
  {
    System.out.println("Singleton Design Pattern");
  }

  public void changeNum()
  {
    num = num + 2;
    System.out.println("num: " + num);
  }
}

