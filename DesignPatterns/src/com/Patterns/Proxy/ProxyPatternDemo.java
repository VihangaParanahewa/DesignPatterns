package com.Patterns.Proxy;

public class ProxyPatternDemo
{

  public static void main(String[] args)
  {

    Image image = new ProxyImage("abc.png");

    image.display();
    System.out.println("\n");

    image.display();




  }

}
