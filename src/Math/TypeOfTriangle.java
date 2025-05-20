package Math;

public class TypeOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 8,4,4 };
		System.out.println(triangleType(a));
	}

	public static String triangleType(int[] nums) {
        String a = "";
        
        
        if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
        	if(nums[0] == nums[1] && nums[1] == nums[2]){
                a = "equilateral";
            }
        	else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[1] || nums[0] == nums[2]){
        		a = "isosceles ";
            }
        	else {
        		a = "scalene";
        	}
        }
        else {
        	a = "none";
        }
        return a;
        }
}
