package com.example.demo;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
		quick(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void quick(int[] arr, int low, int high) {
		System.out.println("low:" + low + ", high:" + high);
		if (low < high) {
			//寻找基准位置的索引
			int index = getIndex(arr, low, high);
			
			//递归左右循环扫描
			quick(arr, 0, index-1);
			System.out.println("=======================");
			quick(arr, index+1, high);
		}
		
	}

	private static int getIndex(int[] arr, int low, int high) {
		//定义基准位置
		int temp = arr[low];
		
		while (low < high) {
			
			while(low < high && arr[high] >= temp) {
				high--;
			}
			//如果右边的小于基准的交换首尾的值
			arr[low] = arr[high];
			
			while(low < high && arr[low] <= temp) {
				low++;
			}
			
			//如果左边边的大于基准的交换首尾的值
			arr[high] = arr[low];
		}
		
		arr[low] = temp;
		return low;
	}
}
