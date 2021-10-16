package testpractice;

import java.util.Scanner;

public class Reverse {
public static String reverseArray(String s) {
	char[] ch = s.toCharArray();
	String rev="";
	for(int i=ch.length-1;i>=0;i--) {
		rev+=ch[i];
	}
	return rev;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String in = sc.nextLine();
	String out = reverseArray(in);
	System.out.println(out);
	
}
}
