class Solution {
    public boolean isPalindrome(String s) {
        String cl=s.replaceAll("[^a-zA-Z0-9]", "");
        String rev= new StringBuilder(cl).reverse().toString();
        if (cl.equalsIgnoreCase(rev)) return true;
        else return false;

        
    }
}
