class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res=new HashSet<>();
       HashSet<Integer> set=new HashSet<>();
       for(int x:nums1){
        set.add(x);
       }
       for(int y:nums2){
        if(set.contains(y)){
            res.add(y);
        }
       }
       int ans[]=new int[res.size()];
       int i=0;
       for(int x:res){
        ans[i]=x;
        i++;
       }
       return ans; 
    }
}