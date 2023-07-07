//34. Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays.*;

public class LC34{
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,8,8,8,8,10};
		int target = 8;
		int[] ans = new int[2];
		ans[0] = firstInd(nums,target);
		ans[1] = lastInd(nums,target);
		// System.out.println(Arrays.toString(ans));
		System.out.println("[" + ans[0] + "," + ans[1] + "]");
	}
	static int firstInd(int[] nums,int target){
		int index = -1;
		int start = 0;
		int end = nums.length - 1;

		while(start <= end) {
			int mid = start + (end - start)/2;
			if(nums[mid] >= target){
				end = mid-1;
			}else{
				start = mid+1;
			}
			if(nums[mid] == target){
				index = mid;
			}
		}
		return index;
	}
	static int lastInd(int[] nums,int target){
		int index = -1;
		int start = 0;
		int end = nums.length - 1;

		while(start <= end) {
			int mid = start + (end - start)/2;
			if(nums[mid] <= target){
				start = mid+1;
			}else{
				end = mid-1;
			}
			if (nums[mid] == target){
				index = mid;
			}
		}
		return index;
	}
}
