class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length == 0)
        return ""; // Edge Cases
        String prefix = strs[0];  //taking the first work as staring prefix 
        for (int i=1 ; i < strs.length; i++)
        {
            while(!strs[i].startsWith(prefix))
            prefix = prefix.substring(0,prefix.length()-1);
            {
                if (prefix.isEmpty())
                return "";
            }
        }
        return prefix ;
        
    }
}