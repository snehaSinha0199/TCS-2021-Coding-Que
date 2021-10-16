package testpractice;

import java.util.Scanner;

public class AlphabeticalLetters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String in = sc.nextLine();
	String n = in.toLowerCase();
	char[] ch = in.toCharArray();
	int length = ch.length;
	int count=0;
	
	for(int i=0;i<length;i++) {
		 int ascii=ch[i];
			if(ch[i]==ascii) {
				count++;
		}
			ascii++;
	}
	System.out.println(count);
}
}
