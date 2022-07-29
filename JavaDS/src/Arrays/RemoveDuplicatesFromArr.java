package Arrays;

public class RemoveDuplicatesFromArr {

	
	 public int removeDuplicates(int[] nums) {
	        
        int len = nums.length;
        
        int[] newNum = new int[len];
        int j = 0;
        
        for(int i =1; i<len+1 ; i++) {
            int checkNum = nums[j];
            newNum[j] = checkNum;
            while(i<len && checkNum >= nums[i]) {
                i++;
            }
            j++;
        }
        
        for(int k =j ; k<newNum.length; k++) {
            newNum[k] = '_';
        }
        
        return j;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicatesFromArr rd = new RemoveDuplicatesFromArr();
		int[] arr = new int[] {0,0 , 1,1,1,2,2,3,3,4};
		System.out.println(rd.removeDuplicates(arr));
		

	}

}
