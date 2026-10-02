class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,m_c=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            c++;
            m_c=Math.max(m_c,c);
        }
        else{
            c=0;
        }
       } 
       return m_c;
    }
}