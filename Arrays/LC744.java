//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class LC744{
	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		char target = 'a';
		int ans = ceiling(letters,target);
		System.out.println(letters[ans]);
	}
	static int ceiling(char[] letters, char target){
		int start = 0;
		int end = letters.length - 1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if (letters[mid] > target){
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		if (start == letters.length){
			return 0;
		}else{
			return start;
		}	
	}
}
