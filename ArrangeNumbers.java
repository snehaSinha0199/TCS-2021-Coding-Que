package testpractice;

import java.util.Scanner;

public class ArrangeNumbers {
public static String arrangeNumbersPriority(String s) {
	String digits="",characters="",oddNum="",evenNum="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			digits+=s.charAt(i);
		}
		else {
			characters+=s.charAt(i);
		}
		
	}
	
	for(int i=0;i<digits.length();i++) {
		if(digits.charAt(i)%2==1) {
			oddNum+=digits.charAt(i);
		}
		else 
			evenNum+=digits.charAt(i);
		
	}
	oddNum+=evenNum;
	evenNum="";
	for(int i=0;i<characters.length();i++) {
		if(characters.charAt(i)%2==1) {
			oddNum+=characters.charAt(i);
		}
		else {
			evenNum+=characters.charAt(i);
		}
	}
	oddNum+=evenNum;
	return oddNum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num = sc.nextInt();
	String arr[]=new String[num];
	sc.nextLine();
	for(int i=0;i<arr.length;i++) {
	arr[i] = sc.nextLine();
	arrangeNumbersPriority(arr[i]);
	}
	sc.close();
		
	
}
}
