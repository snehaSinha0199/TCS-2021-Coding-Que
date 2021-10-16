package testpractice;

public class ReverseArr {
public static void reverseArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		int first=arr[i];
		for(int j=arr.length-1;j>0;j--) {
			arr[i]=arr[j];
			arr[j]=first;
		}
	}
}
public static void main(String[] args) {
	int[] arr=new int[] {1,2,3,4,5};
	reverseArray(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
