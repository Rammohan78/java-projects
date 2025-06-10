package xyz;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearchsortedarry {
	public static void main(String []args) {
		String[] names= {"AMIT","DIVYA","KARAN","PRIYA","ZOYA"};
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NAMES TO  SEARCH:");
		String newsc=sc.next();
		int index=Arrays.binarySearch(names,newsc);
		if (index>=0) {
			System.out.println(newsc+" "+"found at index"+index);
		}
		else {
			System.out.println(newsc+""+"not found at index"+index);
		}
		
		sc.close();
	}
	

}
