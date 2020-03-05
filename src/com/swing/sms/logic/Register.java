package com.swing.sms.logic;

public class Register {

	public String student[]={"Ajith","Bala","Danniel","Jana","Kumar"};
	String date[]=new String[7];
	int dateConter=0;
	boolean register[][]=new boolean[student.length][7];
	
	public void markregister(String dateStr,boolean[] arr) {

		date[dateConter]=dateStr;
		
		for(int i=0;i<student.length;i++){
			
			register[i][dateConter]=arr[i];
		}
		dateConter++;
	}
	
	
	
	public void printRegister() {
		System.out.print("\t");
		for (int i = 0; i < dateConter; i++) {
			System.out.print(date[i] + "|\t");
		}
		System.out.println();
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i] + "\t");
			for (int j = 0; j < dateConter; j++) {
				System.out.print("   " + register[i][j] + "    \t");
			}
			System.out.println();
		}
	}
}
