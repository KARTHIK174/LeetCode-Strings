class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String string : arr)
            result.append(new StringBuilder(string).reverse()).append(" ");
        return result.toString().trim();
    }
}
