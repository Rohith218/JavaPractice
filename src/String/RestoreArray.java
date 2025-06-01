package String;

public class RestoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfArrays("10000",10));;
//		System.out.println(perm("10000",10));
	}
	public static int numberOfArrays(String s, int k) {
        int c =0;
        	StringBuilder s1 = new StringBuilder();
            for(int i =0;i<s.length();i++) {
            	if(s.charAt(i)!='0') {
            		s1.append(s.charAt(i));
            	}
            }
            c = perm(s1.toString(),k);
        return c;
	}
	public static int perm(String a,int k) {
		// TODO Auto-generated method stub
		String[] s = new String[k];
		int j =0;
		for(int i =0;i<a.length();i++) {
			StringBuilder s1 = new StringBuilder();
			s1.append(a.charAt(i));
			s[j]  = s1.toString();
			j++;
			for(int l =i+1;l<a.length();l++) {
				s1.append(a.charAt(l));
				s[j] = s1.toString();	
				j++;
			}
		}
		int dup=0;
		for(int i =0;i<j;i++) {
			int count =0;
			for(int l =0;l<s.length;l++) {
				if(s[i].equals(s[l])) {
					count++;
				}
			}
			System.out.println(s[i]);
			if(count>1 || Integer.parseInt(s[i])>k) {
				dup++;
			}
		}
		System.out.println(j +"   "+dup);
		return j - dup;
	}

}
