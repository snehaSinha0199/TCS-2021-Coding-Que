package testpractice;

import java.util.Scanner;

public class LargestNumber {
public static int largestNumberArray(int n) {
	int value=0;
    String temp = Integer.toString(n);
int[] arr=new int[temp.length()];
for(int i=0;i<temp.length();i++) {
	arr[i]=temp.charAt(i)-'0';
}
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			if(value<arr[j]) {
			value=arr[j];
		}
		}
		}
}

return value;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int in = sc.nextInt();
	int output = largestNumberArray(in);
	System.out.println(output);
}
}
