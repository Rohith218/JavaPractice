package String;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  hello world  ";
		System.out.println(reverseWords(s));
//		System.out.println(removeWhiteSpace(s));
	}

	public static String reverseWords(String s) {
		StringBuilder a = new StringBuilder();
		String[] b = s.split(" ");
		int n = b.length;
		boolean firstWordAdded = false;
		for(int i=n-1;i>=0;i--) {
			if (!b[i].isEmpty()) {
	            if (firstWordAdded) {
	                a.append(" ");
	            }
	            a.append(b[i]);
	            firstWordAdded = true;
	        }
		}
		return a.toString();
	}
	public static String removeWhiteSpace(String s) {
		StringBuilder a = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!= ' ') {
				a.append(s.charAt(i));
			}
		}
		return a.toString();
	}

}
