class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        long sum=0;
        
        for(int i=0;i<k;i++){
            sum+=nums[i];
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        long m_sum=0;
            for(int j=k;j<n;j++){
               if(m.size()==k){
                m_sum=Math.max(m_sum,sum);
               }
                sum-=nums[j-k];
                m.put(nums[j-k],m.get(nums[j-k])-1);
               if(m.get(nums[j-k])==0) m.remove(nums[j-k]);
                sum+=nums[j];
                m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            }
            if(m.size()==k){
                m_sum=Math.max(m_sum,sum);
            }
            return m_sum;
        }
    }
