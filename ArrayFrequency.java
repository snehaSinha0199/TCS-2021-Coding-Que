package testpractice;

public class ArrayFrequency {
	
public static void frequencyOfArray(int[] arr) {
	
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				System.out.println(arr[i]+"| "+count);
			}
			
		}
	}
}
}
