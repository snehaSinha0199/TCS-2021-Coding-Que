package testpractice;

import java.util.Scanner;

public class EvenTowerSurvey {
public static int evenNoTowerFloor(int[] arr) {
	int count=1,key=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				 key=arr[i];
				count++;
				arr[j]=-1;
				
			}
		}
		if(count%2==0) {
			return key;
		}
		else {
			count=1;
		}
	}
	
	return -1;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//int n = sc.nextInt(); raising NumberFormatException
	String s = sc.nextLine();
	String[] in = s.split(",");
	int[] arr=new int[in.length];
	for(int i=0;i<arr.length;i++) {
	arr[i]=Integer.parseInt(in[i]);	
	}
	int output = evenNoTowerFloor(arr);
	System.out.println(output);
	
	sc.close();
}
}
