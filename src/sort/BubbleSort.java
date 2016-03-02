package sort;

/**
 * 冒泡排序 O(n^2)
 * @author xxxknight
 * 特点：稳定
 */
public class BubbleSort {
	public static int[] bubbleSort(int[] arr) {
		int len = arr.length;
		if (len == 0) {
			return new int[]{};
		}
		
		//外循环：总共需要遍历的趟数n-1
		for (int i = 0; i < len - 1; i++) {
			
			// 内循环：每一趟需要比较的次数
			for (int j = 1; j < len - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] bubbleSortWihtPos(int[] arr) {
		int len = arr.length;
		if (len == 0) {
			return null;
		}
		int pos = len-1;
		while (pos!=0) {
			int bound = pos;
			pos = 0;
			for (int i = 1; i < bound; i++) {
				if (arr[i-1]>arr[i]) {
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					pos = i;
				}
				
			}
			
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49, 55, 4 };
		int[] res = bubbleSort(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
		int[] res1 = bubbleSortWihtPos(arr);
		for (int i = 0; i < res1.length; i++) {
			System.out.println(res1[i]);
		}

	}

}
