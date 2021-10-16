package testpractice;

import java.util.Scanner;

public class Coins {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	
	String s1 = sc.nextLine();
	String[] split1 = s1.split(",");
	int[] arr1=new int[n];
	for(int i=0;i<n;i++) {
		arr1[i]=Integer.parseInt(split1[i]);
	}
	String s2 = sc.nextLine();
	String[] split2 = s2.split(",");
	int[] arr2=new int[m];
	for(int i=0;i<m;i++) {
		arr2[i]=Integer.parseInt(split2[i]);
	}
	int count=0;
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if((arr1[i]*arr2[j])%2==0) {
			count++;
		}
	}
}
System.out.println(count);
}
}
