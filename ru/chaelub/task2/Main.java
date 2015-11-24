package ru.chaelub.task2;

public class Main {

	private static double EPSILON = 1e-10d;

	public static void main(String[] args){
		int i;
		String s;
		if(args.length!=0){
			for(i=0; i<args.length;i+=2){
				s = args[i];
				if(s.equals("-e")){
					if((i+1)>=args.length){
						calculate(EPSILON);
					}
					else{
						calculate(Double.parseDouble(args[i+1]));
					}
				}
			}
		}
		else {
			calculate(EPSILON);	
		}
	}

	private static void calculate(Double e) {
		if(e!=null){
			System.out.println("Эпсилон: "+e);
			int i;
			double a;
			a=1.0;
			for(i=1;a>=e;i++){
				a = 1/(Math.pow((i+1),2));
				System.out.println("Текущее знаечение функции для i="+i+" равняется "+a);
			}
		}
	}
}