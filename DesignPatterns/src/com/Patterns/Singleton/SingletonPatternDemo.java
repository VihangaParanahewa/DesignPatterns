package com.Patterns.Singleton;

public class SingletonPatternDemo
{

  public static void main(String[] args)
  {
    SingleObject object = SingleObject.getInstance();

    object.showMessage();
    object.changeNum();

    SingleObject objTest = SingleObject.getInstance();
    objTest.changeNum();
  }

}
