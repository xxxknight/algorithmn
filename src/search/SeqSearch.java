package search;

/**
 * 带有哨兵的顺序查找
 * @author xxxknight
 *
 */

public class SeqSearch {
	public static int seqSearch(int[] arr,int key){
		int len = arr.length;
		if (len == 0) {
			return -1;
		}
		if(arr[0] == key){
			return 0;
		}else{
			arr[0] = key;
		}
		int index = len-1;
		for(;arr[index]!=key;index--);
		return index==0?-1:index;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(seqSearch(arr, 2));
		System.out.println(seqSearch(arr, 6));
	}

}
