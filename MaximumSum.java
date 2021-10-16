package testpractice;

public class MaximumSum {
public static void sumNum(int[] arr) {
	int sum=0,count=0,key=2;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				if(sum==0) {
				sum+=arr[i]+arr[j];
				}
				if(sum!=0) {
					sum+=arr[j];
				}
				count++;
				if(count>=key) {
					System.out.println(sum);
				}
			}
			else {
				sum=0;
				
			}
			break;
		}
	}	
}
public static void main(String[] args) {
	int[] arr= {203,202,2,3,200,4,5};
	sumNum(arr);
}
}
