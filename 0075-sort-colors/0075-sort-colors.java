class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0,pos=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else{
                t++;
            }
        }
       for(int i=0;i<z;i++){
        nums[pos]=0;
        pos++;
       }
       for(int i=0;i<o;i++){
        nums[pos]=1;
        pos++;
       } 
       for(int i=0;i<t;i++){
        nums[pos]=2;
        pos++;
        }

    }
}