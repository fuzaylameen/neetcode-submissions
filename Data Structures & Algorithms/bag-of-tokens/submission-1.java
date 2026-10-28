class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int l=0,r=tokens.length-1;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                l++;
            }
            else if(score>0 && l!=r){
                power+=tokens[r];
                score--;
                r--;
            }
            else break;
        }
        return score;
    }
}