// leat code...
public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {

       int[]  nums={3,2,6,9,8,8};
       System.out.println(maxAscendingSum(nums)); 

    }

    public static int maxAscendingSum(int[] nums) {
        if(nums.length==1)return nums[0];
        int prev=0,maxSum=0,sum=0;
        for(int n:nums){
                if(prev!=0 && prev<n){
                    sum+=n; 
                     if(sum!=0 && sum>maxSum)maxSum=sum;
                }

                else if(prev!=0 && maxSum==0){
                   maxSum=prev;
                   sum=n;
                }
                else sum=n;
          prev=n;
        }
        return maxSum;
        
    }
}
