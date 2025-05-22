package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,22,22,22,1,11,1,1,2,3,3,4};
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for(int i =0;i<arr.length;i++) {
			hmap.put(arr[i], hmap.getOrDefault(hmap.get(arr[i]), 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
	}

}
