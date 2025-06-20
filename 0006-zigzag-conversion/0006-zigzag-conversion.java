class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<numRows){
            return s;
        }

        StringBuilder sb=new StringBuilder();
        int cycle=2*numRows-2;

        for(int row=0;row<numRows;row++){
            for(int i=row;i<s.length();i+=cycle){
                sb.append(s.charAt(i));

                int diag=i+cycle-2*row;
                if(row!=0 && row!=numRows-1 && diag<s.length()){
                    sb.append(s.charAt(diag));
                }
            }
        }
        return sb.toString();
        
    }
}