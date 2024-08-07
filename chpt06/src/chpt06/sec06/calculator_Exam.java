package chpt06.sec06;

import java.util.Scanner;

import chpt06.sec05.Calculator;

public class calculator_Exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double rs1 = 10*10* Calculator.pi;
		
		int rs2 = Calculator.plus(10, 5);	
		int rs3 = Calculator.minus(10, 5);
		
		
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);

	}

}
