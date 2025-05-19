package Arrays;

public class TypeOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 9, 4, 9 };
		System.out.println(triangleType(a));
	}

	public static String triangleType(int[] nums) {
        String a = "";
        if(nums[0] + nums[1] == 2*nums[2]){
            a = "equilateral";
        }
        else{
        	if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[1]){
        		a = "isosceles ";
            }
        	else{
        		a = "scalene";
        	}
        }
        return a;
        }
}
