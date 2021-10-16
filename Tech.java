package testpractice;

public class Tech {
public static void techNumber(int n) {
	int firstHalf=0,secondHalf=0,digits=0,num=n,square=0;
	while(num>0) {
		digits++;
		n=n/10;
	}
	if(digits%2==0) {
		firstHalf=num%(int)Math.pow(10, digits/2);
		secondHalf=num/(int)Math.pow(10, digits/2);
		 square=(firstHalf+secondHalf)*(firstHalf+secondHalf);
		
	
	if(square==n) {
		System.out.println("The number "+n+" is tech number");
	}
	else {
		System.out.println("The number "+n+" is not a tech number");
	}
	}
	else {
		System.out.println("The number "+n+" is not a tech number");
	}

}
public static void main(String[] args) {
	int count=0;
	char[] ch=new char[] {'!', '.' , '"' , '-' ,',' , '?' , ';'};
	String s="He said his wife doesnt love him.do you love her?I asked.";
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<ch.length;j++) {
		if(s.charAt(i)==ch[j]) {
			count++;
		}
	}
	}
	System.out.println("The number of punction is "+count);
}
}