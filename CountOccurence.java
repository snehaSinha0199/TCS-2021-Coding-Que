package testpractice;

import java.util.Scanner;

public class CountOccurence {
public static int lastDigitOccurence(int[] arr) {
	int count=0;
	int index=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(index==arr[i]) {
			count=i-1;
			
		}
	}
		return count;
}
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String next = sc.nextLine();
     String[] in = next.split(" ");
     int[] arr=new int[in.length];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=Integer.parseInt(in[i]);
     }
     int out = lastDigitOccurence(arr);
     System.out.println(out);
     sc.close();
}
}
