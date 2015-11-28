package ru.chaelub.task3;

// import junit.framework.TestCase;


public class Fun {

  private double startDiapasone;
  private double endDiapasone;
  private double step;

  public Fun(){
    this(0.0,1.0,0.2);
  }

  public Fun(Double startDiapasone, Double endDiapasone, Double step){
    this.startDiapasone = startDiapasone;
    this.endDiapasone = endDiapasone;
    this.step = step;
  }

  public void calculateFun(){
    double pos;
    double cur;
    for(pos=startDiapasone; pos<=endDiapasone; pos+=step){
      cur = Math.tan(2*pos) - 3;
      System.out.format("| %-15.5f| %-15.5f|\n",pos, cur);
    }
  }

  public void printYourVals(){
    System.out.println(startDiapasone+" "+endDiapasone+" "+step);
  }

}