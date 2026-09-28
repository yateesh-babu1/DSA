class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:nums1){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int y:nums2){
           m1.put(y,m1.getOrDefault(y,0)+1); 
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:m.keySet()){
            if(m1.containsKey(x)){
                int freq=Math.min(m.get(x),m1.get(x));
            for(int i=0;i<freq;i++){
                list.add(x);
            }
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}