package Arrays;

public class MinStartValue {
	
	 public int minStartValue(int[] nums) {
	        
	        int startValue = 4;
	        int sum = startValue;
	        for(int i=0; i<nums.length; i++) {
	            sum += nums[i];
	        }
	        
	        if(sum < 1) {
	            return startValue;
	        }
	        
	        return sum;
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinStartValue n = new MinStartValue();
		int[] intArray = new int[]{ -3,2,-3,4,2 }; 
		
		n.minStartValue(intArray);
	}

}
