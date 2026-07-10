class Solution {
    public int maxDigitRange(int[] nums) {
        ArrayList <Integer> l1 = new ArrayList<>();
        int c = 0;
        for( int i = 0;i<nums.length;i++)
        {
            ArrayList<Integer> s1 = new  ArrayList<>();
            int copy = nums[i];
            while(copy != 0)
            {
                s1.add(copy%10);
               copy = copy/10;
            }
            Collections.sort(s1);
            int a = s1.get(s1.size() - 1);
            int b = s1.get(0);
            l1.add(a-b);
            
                if(c < l1.get(i))
                {
                  c = l1.get(i);
                }
        }
        int ans = 0;
         for(int i = 0;i<nums.length;i++)
         {
            if(c == l1.get(i))
            {
                  ans = ans + nums[i];
            }
         }
         return ans;
    }
}