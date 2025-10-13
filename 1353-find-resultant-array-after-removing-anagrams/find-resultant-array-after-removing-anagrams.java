class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        List<Map<Character,Integer>> freq = new ArrayList<>();
        for(String s: words){
            Map<Character,Integer> map = new HashMap<>();  
            for(int i = 0; i < s.length(); i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
            }
            freq.add(map);
        }    
        ans.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(!freq.get(i).equals(freq.get(i - 1))){
                ans.add(words[i]);
            } 
        }
        return ans;
    }
}