class Solution {
    public int calPoints(String[] operations) {
        int [] stack= new int [1000];
        int top =0; int sum=0;
        for(int i=0 ; i<operations.length; i++){
            if(operations[i].equals("+")){
                stack[top]=stack[top-1]+stack[top-2];
                top++;
            }
            else if(operations[i].equals("C")) top--;
            else if(operations[i].equals("D")){ stack[top]=2*stack[top-1]; top++;}
            else stack[top++]=Integer.parseInt(operations[i]);
        }
        for(int i=0;i<top; i++){
            sum+=stack[i];
        }
        return sum;
    }
}