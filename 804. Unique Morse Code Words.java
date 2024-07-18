class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morsecode = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String str:words){
            StringBuilder sb = new StringBuilder();
            for(char ch:str.toCharArray()){
                sb.append(morsecode[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
