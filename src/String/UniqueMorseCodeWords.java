package String;

import java.util.HashMap;
import java.util.Map;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"});
	}

	public static int uniqueMorseRepresentations(String[] words) {
		String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		int c =0;
		HashMap<String,Integer> hmap = new HashMap<>();
		for(int i=0;i<words.length;i++) {
			StringBuilder s1 = new StringBuilder();
			for(int j=0;j<words[i].length();j++) {
				s1.append(code[words[i].charAt(j)-'a']);
			}
			hmap.put(s1.toString(), hmap.getOrDefault(hmap.get(s1.toString()), 0)+1);
		}
		for(Map.Entry<String,Integer> map: hmap.entrySet()) {
			c++;
		}
		return c;
	}

}
