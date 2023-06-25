package Assgnments;

public class Move_all_zeros {
	public static int[] helper(int[] arr) {
		int n = arr.length;
		int j = 0;
		for(var i : arr) {
			if(i != 0)
				arr[j++] = i;
		}
		while(j < n)arr[j++] = 0;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		int[] ans = helper(arr);
		for(var i : arr) {
			System.out.print(i+" ");
		}
	}

}
