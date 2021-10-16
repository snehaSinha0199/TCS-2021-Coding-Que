package testpractice;

public class ArrayProgram {
public static void copyOfArray(int[] arr1) {
	int[] arr2=new int[arr1.length];
	for(int i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];
	}
	System.out.println("Elements of arr1 are:");
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]);
	}
	System.out.println();
	System.out.println("Elements of arr2 are:");
	
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]);
	}
	
}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,6};
copyOfArray(arr);	
}
}
