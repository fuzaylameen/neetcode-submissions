class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String i : tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                if(i.equals("+")){
                    int res= stack.pop() + stack.pop();
                    stack.push(res);
                }
                else if(i.equals("-")){
                    int n1=stack.pop();
                    int n2=stack.pop();
                    int res= n2-n1;
                    stack.push(res);
                }
                else if(i.equals("*")){
                    int res= stack.pop() * stack.pop();
                    stack.push(res);
                }
                else if(i.equals("/")){
                    int n1=stack.pop();
                    int n2=stack.pop();
                    int res= n2/n1;
                    stack.push(res);
                }
            }
            else{
                int res=Integer.parseInt(i);
                stack.push(res);
            }
        }
        return stack.peek();
        
    }
}
