package com.velocity.git;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println(" Plese Enter A Number ");
		Scanner scanner = new Scanner(System.in);
		int int1 = scanner.nextInt();
		int count = 0;
		for(int i=int1;i>0;i--) {
			if(int1 % i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println(" Number is not Prime .... ");
		}
		else {
			System.out.println(" Number is Prime .... ");
		}
	}

}
