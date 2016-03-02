package sort;

/**
 * 快速排序 O(nlogn)，栈的深度为O(logn)
 * @author xxxknight
 * 特点：不稳定
 */
public class QuickSort {
	public static int[] quickSort(int[] arr, int i,int j) {
		int len = arr.length;
		if (len == 0) {
			return new int[]{};
		}
		
		if (i<j) {
			int pivotLoc = partion(arr, i, j);
			quickSort(arr, i, pivotLoc-1);
			quickSort(arr, pivotLoc+1, j);
		}
		return arr;
	}
	
	public static int  partion(int[] arr, int first, int end) {
		int i = first;
		int j = end;
		int pivot = arr[i];
		while (i<j) {
			while ((i<j) && (arr[j]>=pivot)) {
				j--;
			}
			arr[i] = arr[j];
			while ((i<j) && (arr[i]<=pivot)) {
				i++;
			}
			arr[j]=arr[i];
		}
		arr[j]=pivot;
		return i;
	}

	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27};
		int[] res = quickSort(arr,0,arr.length-1);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
	}

}
