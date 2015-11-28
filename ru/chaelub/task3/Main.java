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


  String startDiapasonS;
  String endDiapasonS;
  String stepS;
  double startDiapason=0.0;
  double endDiapason=10.0;
  double step=1.0;
  boolean ok = false;
  while(!ok){
    startDiapasonS = c.readLine("Please, define the diapson start:");
    endDiapasonS = c.readLine("Please, define the diapson end:");
    stepS = c.readLine("And please, define the step:");
    startDiapason = Double.valueOf(startDiapasonS);
    endDiapason = Double.valueOf(endDiapasonS);
    step = Double.valueOf(stepS);
    if((startDiapason > endDiapason)||(step<=0)){
      System.out.println("Please input correct values. All values must be double;\n'Diapason Start' must be less then 'Diapson End';\n'Step' must be greater than 0 (zero).");
    }
    else{
      ok=true;
    }

  }

  if(ok){
    Fun f = new Fun(startDiapason, endDiapason, step);
    f.calculateFun();
  }
  }
}