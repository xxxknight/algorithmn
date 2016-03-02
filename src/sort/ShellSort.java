package sort;

/**
 * 希尔排序 复杂度O(n^2)和O(nlogn)之间，空间复杂度O(1)
 * @author xxxknight
 * 特点：不稳定，缩小增量排序，是对插入排序的一种改进
 */

public class ShellSort {
	public static int[] shellSort(int[] arr) {
		int len = arr.length;
		if (len == 0) {
			return new int[]{};
		}
		for (int d = len/2; d >= 1; d=d/2) {
			for (int i = d; i < len; i++) {
				if (arr[i]<arr[i-d]) {
					int temp = arr[i];
					int j = i-d;
					for (; j >=0 && temp<arr[j]; j= j-d) {
						arr[j+d] = arr[j];
					}
					arr[j+d] = temp;
					
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {

		int[] arr = {49,38,65,97,76,13,27,49,55,4};
		int[] res = shellSort(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
