package testpractice;

import java.util.Arrays;

public class Anagram {
public static void stringAnagram(String s1,String s2) {
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	int count=0;
	for(int i=0;i<s1.length();i++) {
		for(int j=0;j<s2.length();j++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				count++;
			}
		}
	}
	if(s1.length()==count) {
		System.out.println("The string "+s1+" and "+s2+" is anagram.");
	}
	else {
		System.out.println("The string "+s1+" and "+s2+" is not an anagram.");
	}
}
public static void anagram(String s1,String s2) {
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	char[] ch=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	if(s1.length()!=s2.length()) {
		System.out.println("The string s is not a anagram");
	}
	else {
	Arrays.sort(ch);
	Arrays.sort(ch2);
	
	if(Arrays.equals(ch, ch2)==true) {
		System.out.println("The string s is anagram");
	}
	else {
		System.out.println("not a anagarm");
	}
	}
	
}
public static void main(String[] args) {
	stringAnagram("Brag", "Gran");
}
}
