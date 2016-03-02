package sort;

/**
 * 简单选择排序 时间复杂度O(n^2)
 * @author xxxknight
 * 特点：不稳定
 */

public class SelectSort {
	public static int[] selectSort(int[] arr) {
		int len = arr.length;
		if (len == 0) {
			return new int[]{};
		}
		for (int i = 0; i < len; i++) {
			int pos = i;
			for(int j=i+1;j<len;j++){	//查找最小记录的位置
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}
			if (pos != i) {	//若第一就是最小元素，则不用交换
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {49,38,65,97,76,13,27,49,55,4};
		int[] res = selectSort(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
