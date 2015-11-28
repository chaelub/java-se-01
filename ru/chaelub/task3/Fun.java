package ru.chaelub.task3;

// import junit.framework.TestCase;


public class Fun {

  private double startDiapason;
  private double endDiapason;
  private double step;

  public Fun(){
    this(0.0,1.0,0.2);
  }

  public Fun(Double startDiapason, Double endDiapason, Double step){
    this.startDiapason = startDiapason;
    this.endDiapason = endDiapason;
    this.step = step;
  }

  public void calculateFun(){
    double pos;
    double cur;
    System.out.format("\n| %-15s| %-15s|\n","X value", "Function value");
    for(pos=startDiapason; pos<=endDiapason; pos+=step){
      cur = Math.tan(2*pos) - 3;
      System.out.format("| %-15.5f| %-15.5f|\n",pos, cur);
    }
  }

  public void printYourVals(){
    System.out.println(startDiapason+" "+endDiapason+" "+step);
  }

}