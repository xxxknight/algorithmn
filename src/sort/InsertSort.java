package sort;

/**
 * 插入排序	复杂度O(n^2)
 * @author xxxknight
 * 特点：稳定，适合于待排序集合基本有序的情况
 */

public class InsertSort {
	public static int[]  insertSort(int[] arr) {
		int len = arr.length;
		if (len==0) {
			return new int[]{};
		}
		for (int i = 1; i < len; i++) {
			if (arr[i]<arr[i-1]) {
				int temp = arr[i];
				int j=i-1;
				for (; j>=0; j--) {
					if (temp<arr[j]) {
						arr[j+1] = arr[j]; 
					}else{
						break;
					}
				}
				arr[j+1] = temp;
			}
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,15,9,20,10,31,24};
		int[] res = insertSort(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
