package testpractice;

public class DuplicateElementsArray {
public static void duplicateElementsOfArray(int arr[]) {
	int position=-1;
	int index=0;
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count>1) {
			index=arr[i];
			System.out.println(arr[index]);
		}
	}
}
public static void duplicate(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
}
	}
}
public static void main(String[] args) {
	int []arr=new int[] {1,2,3,4,2,7,8,2,8,3};
	duplicateElementsOfArray(arr);
}
}
