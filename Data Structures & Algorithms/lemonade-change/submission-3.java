class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twe=0;
        if(bills[0]>5)return false;
        five ++;
        for(int i=1; i<bills.length; i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                if(five==0)return false;
                else{
                    five--;
                    ten++;
                }
            }
            else{
                if(five>=3 || (ten>=1 && five>=1)){
                    if(ten>=1){
                        ten--;
                        five--;
                        twe++;
                    }
                    else{
                        five-=3;
                        twe++;
                    }
                }
                else return false;
            }
        }
        return true;
    }
}