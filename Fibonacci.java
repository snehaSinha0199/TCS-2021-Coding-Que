package testpractice;

public class Fibonacci {
	
	public static void reverse(int n) {
		
		while(n!=0){
			int result=n%10;
			System.out.print(result);
			n=n/10;
		}
	}
	public static void armstrong(int n) {
		
			int temp=n,count=0,sum=0,result=0,temp1=n;
			while(temp!=0) {
				temp=temp/10;
				count++;
				
			}
			while(temp1!=0) {
				result=temp1%10;
				sum=sum+(int)Math.pow(result,count);
				temp1=temp1/10;
			}
			if(n==sum) {
				System.out.println("The number "+n+" is armstrong");
			}
			else
				System.out.println("The number is "+n+" not armstrong");
			
		}
	public static void palindrome(int n) {
		int temp=n,result=0,value=0;
		while(temp!=0) {
			result=temp%10;
			temp=temp/10;
		}
		if(value==n) {
			System.out.println("The number "+n+" is palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		//reverse(634738282);
		armstrong(153);
	}
}
