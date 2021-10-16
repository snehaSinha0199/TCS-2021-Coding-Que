package testpractice;

import java.util.Scanner;

public class PaintRemoval {
public static double paintRemovalTurpentine(int l,int r) {
	double left=0;
	double firstRemoval=l-r;
	double secondRemoval=(firstRemoval*r)/l;
	left=firstRemoval-secondRemoval;
	return left;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int l = sc.nextInt();
	int r = sc.nextInt();
	double output = paintRemovalTurpentine(l, r);
	System.out.println(output);
	sc.close();
}
}
