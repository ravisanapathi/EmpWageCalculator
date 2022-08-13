package com.EmpWageCalculator;

public class EmpAttendance {
	public static void main(String[] args){
		int empPresent = (int) Math.floor(Math.random() * 10) % 2;
		
		if (empPresent == 1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Abscent");
		}
	}

}
