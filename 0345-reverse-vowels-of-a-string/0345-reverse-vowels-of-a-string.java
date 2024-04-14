class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        char[] arr1 = new char[s.length()];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == 'a' || arr[i] == 'e' ||
             arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || 
             arr[i] == 'A' || arr[i] == 'E' ||
             arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                arr1[idx] = arr[i];
                idx++;
             }
        }
        idx = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (arr[i] == 'a' || arr[i] == 'e' ||
             arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || 
             arr[i] == 'A' || arr[i] == 'E' ||
             arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                arr[i] = arr1[idx];
                idx++;
             }
        }
        return String.valueOf(arr);
    }
}