package ru.chaelub.task2;

public class Main {
	public static void main(String[] args){
		Integer i;
		String s;
		if(args.length!=0){
			for(i=0; i<args.length;i+=2){
				s = args[i];
				if(s.equals("-e")){
					calculate(Double.parseDouble(args[i+1]));
				}
			}
		}
		else {
			calculate(1e-16d);	
		}
	}

	private static void calculate(Double e) {
		if(e!=null){
			System.out.println("Эпсилон: "+e);
			Integer i;
			Double a;
			a=1.0;
			for(i=1;a>=e;i++){
				a = 1/(Math.pow((i+1),2));
				System.out.println("Текущее знаечение функции для i="+i+" равняется "+a);
			}
		}
	}
}