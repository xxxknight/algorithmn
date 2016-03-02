package search;

import java.util.Arrays;

/**
 * 
 * @author xxxknight
 *
 */
public class BinarySearch {
	public static int binarySearch(int[]arr ,int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high){
			int mid = low + (high-low)/2; //不用(low+high)/2防止溢出
			if (arr[mid] == key) {
				return mid;
			}else if (arr[mid] > key) {
				high = mid-1;
			}else {
				low = mid+1;
			}
			
		}
		return -1;
		
	}
	
	public static int binarySearchWithNoSort(int[] arr ,int key) {
		Arrays.sort(arr);
		return binarySearch(arr, key);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7,9};
		
		System.out.println(binarySearch(arr, 7));
		System.out.println(binarySearch(arr, 6));
		
		int[] arr2 = {2,1,4,3,5,4};
		System.out.println(binarySearchWithNoSort(arr2, 5));
		System.out.println(binarySearchWithNoSort(arr2, 6));

	}

}
