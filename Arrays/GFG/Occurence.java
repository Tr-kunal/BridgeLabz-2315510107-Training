package GFG;

public class Occurence {
	public static void main(String[] args) {
	int[] arr = {3,2,2,3};
	int ele = 3;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=ele) {
			count++;
		}
	}
	System.out.print(count);
	}
}
