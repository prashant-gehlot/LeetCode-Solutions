class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] answer = new boolean[26];
        for(int i=0; i<sentence.length();i++){
            answer[sentence.charAt(i)-97] = true;
        }
        for(int j=0; j<26; j++){
            if(answer[j]==false){
                return false;
            }
        }
        return true;
    }
}
