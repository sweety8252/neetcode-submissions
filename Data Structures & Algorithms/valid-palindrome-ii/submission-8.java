class Solution {
    public boolean validPalindrome(String s) {

        //s = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return helperMethod(s , left+1 , right) ||
                helperMethod(s , left , right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean helperMethod( String s , int i , int j){

        int left = i ;
        int right = j ;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}