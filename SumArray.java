package testpractice;

import java.util.Scanner;

public class SumArray {
public static void sum(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int in=sc.nextInt();
		/*
		 * int[] arr=new int[in]; for(int i=0;i<in;i++) { arr[i]=sc.nextInt(); }
		 * sum(arr); sc.close();
		 */
	
	String next = sc.nextLine();
	
	String[] s = next.split(" ");
	int[] arr=new int[in];
	for(int i=0;i<in;i++) {
		arr[i]=Integer.parseInt(s[i]);

	}
	sum(arr);
	sc.close();
	}
}

