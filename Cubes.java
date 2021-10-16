package testpractice;

import java.util.Scanner;

public class Cubes {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int m=0,s=0;
	for(int i=2;i<=n;i++) {
		int f=i;
		while(f>0) {
			m=f%10;
			s=s+(m*m*m);
			f=f/10;
		}
		if(s==i) {
			System.out.print(s);
		}
	}
	System.out.println("No Number Found");
}
}
