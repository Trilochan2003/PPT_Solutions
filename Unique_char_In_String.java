package Assgnments;


public class Unique_char_In_String {

	public static int find(String s) {
		int[] freq = new int[26];
		char[] chars = s.toCharArray();
		for(var ch : chars) {
			freq[ch-'a']++;
		}
		for(int i=0; i<chars.length; i++) {
			if(freq[chars[i]-'a']==1)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(find(s));

	}

}
