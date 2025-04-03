package com.Abhishek;

public class Sorting {

	public static void BubbleSort(int[] arr) {
		int n =arr.length;
		int swap=0;
		int loop =0;
		for(int i=0;i< n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				loop++;
				if (arr[j]>arr[j+1]) {
					swap++;
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("No of swaps are "+swap);
		System.out.println("No of loops are "+loop);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] arr = {12,2,20,10,0,64,1,50};
Sorting.BubbleSort(arr);
for(int data:arr) {
	System.out.print(data+" ");
}

	}

}
