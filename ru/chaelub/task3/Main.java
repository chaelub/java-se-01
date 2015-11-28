package ru.chaelub.task3;

import ru.chaelub.task3.Fun;
import java.io.Console;
import java.io.IOException;


public class Main {

  public static void main(String[] args){
    Console c = System.console();
    if (c == null){
      System.out.println("Something wrong.");
      System.exit(1);
    }
  System.out.println("Welcom!");

  Fun f = new Fun(0.0,24.06,0.001);
  f.printYourVals();
  f.calculateFun();
  }
}