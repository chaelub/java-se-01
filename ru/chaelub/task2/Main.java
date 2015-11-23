package ru.chaelub.task2;

public class Main {
	public static void main(String[] args){
		Integer i;
		for(i=0; i<args.length;i+=2){
			if(args[i]=="-e"){
				calculate(Double.parseDouble(args[i+1]));
			}
		}
		calculate(Double.parseDouble(args[1]));
	}

	private static void calculate(Double e) {
		if(e!=null){
			System.out.println("E is "+e);
			Integer i=1;
			Double a=0.0;
			do {
				a = 1/(Math.pow((i+1),2));
				System.out.println("Cur function value is "+a);
				i++;
			}
			while (a>e);
		}
	}
}