package testpractice;

import java.util.Scanner;

public class ShortcutPath {
public static int shortcutPathArray(int[] arr) {
	int forw=2,back=1;
	int index=0;
			int sum=0;
	for(int i=index;i<arr.length;i++) {
		switch(index) {
		case 0:sum=sum+arr[index];
		case 2:sum+=arr[index];
		
		}
		index=forw;
	}
			
	return sum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//int in = sc.nextInt();
	String s = sc.nextLine();
	String[] split = s.split(" ");
	int[] arr=new int[split.length];
	for(int i=0;i<arr.length;i++) {
		arr[i] = Integer.parseInt(split[i]);
	}
	
}
}
