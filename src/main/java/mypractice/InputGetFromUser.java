package mypractice;

import java.util.Scanner;

public class InputGetFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("int num : "+size);
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		for(int num : array) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		Scanner sc2 = new Scanner(System.in);
		String name = sc2.nextLine();
		System.out.println("String name  : "+name);
		
		
	}
}
