class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> Str = new Stack<>();

        for(int i = 0 ; i< n ; i++ ){
            String S = operations[i];
            if(S.equals("C")) Str.pop();
            else if(S.equals("D")) Str.push(2*Str.peek());
            else if(S.equals("+")){
                int top = Str.pop();
                int secondtop = Str.peek();
                int sum = top + secondtop;
                Str.push(top);
                Str.push(sum);
            }
            else{
                Str.push(Integer.parseInt(S));
            }
        }
        int Sum = 0;
        while(Str.size()> 0){
            Sum += Str.pop();
        }
        return Sum;
    }
}