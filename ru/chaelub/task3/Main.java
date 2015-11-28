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

  String startDiapasonS = c.readLine("Please, define the diapson start:");
  String endDiapasonS = c.readLine("Please, define the diapson end:");
  String stepS = c.readLine("And please, define the step:");

  double startDiapason = Double.valueOf(startDiapasonS);
  double endDiapason = Double.valueOf(endDiapasonS);
  double step = Double.valueOf(stepS);

  Fun f = new Fun(startDiapason, endDiapason, step);
  f.calculateFun();
  }
}