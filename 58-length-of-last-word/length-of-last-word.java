class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int a = 0;
        for( int i=0;i<s.length();i++)
        {
             if(s.charAt(i) == ' ')
             {
                a = 0;
             }
             else
             {
                a++;
             }
        }
        return a;
        
    }
}