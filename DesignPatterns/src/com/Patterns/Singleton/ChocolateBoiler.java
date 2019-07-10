package com.Patterns.Singleton;

public class ChocolateBoiler
{
  private boolean empty;
  private boolean boiled;

  private static ChocolateBoiler instance;

  private ChocolateBoiler()
  {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getChocolateBoilerInstance()
  {
    if(instance == null)
    {
      instance = new ChocolateBoiler();
    }
    return instance;
  }
}
