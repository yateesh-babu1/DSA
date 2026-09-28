class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:arr){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int value:m.values()){
            if(!set.add(value)){
                return false;
            }
        }
        return true;
    }
}