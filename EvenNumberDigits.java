public class EvenNumberDigits{
	public static void main(String[] args){
		int[] nums = {12,345,2,6,7869,45};
		System.out.println("Count - "+getEvenDigitNo(nums));
	}
	public static int getEvenDigitNo(int[] nums){
		int result = 0;
		for(int i=0;i<nums.length;i++){
                        int currentNo = nums[i];
                        int count = 0;
                        int element = nums[i];
                        while(element>0)
                        {
                                element = element/10;
                                count++;
                        }
                        if(count%2==0){
                        result+=1;
                        }
                }

                return result;
	}
}
