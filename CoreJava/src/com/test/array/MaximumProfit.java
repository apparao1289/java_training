package com.test.array;

public class MaximumProfit {

	public static void main(String[] args) {
		int a[] = {10,40,90,30,50,100,200,180} ;
		getMaximumProfit(a);
		getBuyAndSellPositions(a);
	}

	public static  void getMaximumProfit(int a[]) {
		int profit = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i + 1] > a[i]) {
				profit = profit + (a[i + 1] - a[i]);
			}
		}
		System.out.println("profit::" + profit);
	}
	
	public static void getBuyAndSellPositions(int a[]) {
		int i=0; int n = a.length;
		while(i<n-1) {
			
			while(i<n-1 && a[i+1] <=a[i]) 
				i++;
			
			if(i== (n-1)) 
				break;
			
			int buy = a[i++];
			
			while(i<n && a[i] >= a[i-1]) 
			  i++;
			
			int sell = a[i-1];
			System.out.println("Buy at::"+buy +"  sell at::"+sell);
		}
	}
}
