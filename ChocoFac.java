package testpractice;

import java.util.Scanner;

public class ChocoFac {
public static int[] packaging(int arr[]) {
	int zero=0,temp=0,count=0;
	int length=arr.length;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0) {
			count++;
			temp=i;
			for(int j=i+1;j<arr.length;j++,i++) {
			arr[i]=arr[j];
			//System.out.print(arr[i]);
			}
			i=temp;
			
			arr[length-1]=0;
		//	length--;
		}
		else {
			arr[i]=arr[i];
			//System.out.print(arr[i]);
		}
		
	}
	return arr;
}
public static void main(String[] args) {
	int[] arr= {6,1,0,8,2,0,9};
	int[] pac= packaging(arr);
	for(int a:pac) {
		System.out.print(a+" ");
	}
}
}
