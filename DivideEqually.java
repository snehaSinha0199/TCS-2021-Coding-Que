package testpractice;

public class DivideEqually {
	public static void divideEqualParts(String s) {
		int length = s.length();
		int n=3;
		if(length%n!=0) {
			System.out.println("string "+s+" cannot be divisible");
		}
		
		
	}
	public static void squareRoot(int num) {
		int div=2;
		while(num>0) {
		if(num%div==0) {
			int quo=num/div;
			if(quo==div) {
				System.out.println("The square root of "+num+" is "+quo);
				num=0;
			}
			else {
				div++;
			}
		}	
		else {
			div++;
		}
		
		}
			
		
	}
	public static void main(String[] args) {
		squareRoot(49);
	}
}

