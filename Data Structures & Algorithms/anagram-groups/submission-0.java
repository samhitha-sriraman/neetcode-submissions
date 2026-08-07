class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
Map <String,List<String>> map = new HashMap<>();

        for(String s :strs )
        {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);

            if(map.containsKey(sortedStr)){
                List<String> list = map.get(sortedStr);
                list.add(s);
                map.put(sortedStr, list);
            }
            else
            {

    List<String> list = new ArrayList<>();
    list.add(s);
        map.put(sortedStr,list);

            }
           
          
        }
        return new ArrayList<>(map.values());

}
        
        
    }
