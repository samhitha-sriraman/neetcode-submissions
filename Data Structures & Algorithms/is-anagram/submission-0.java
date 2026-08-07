class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }
    char [] s1=s.toCharArray();
    char [] s2=t.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(s2);

    

    String word1 = new String(s1); 
    String word2 = new String(s2); 


    return word1.equals(word2);

    }
}
