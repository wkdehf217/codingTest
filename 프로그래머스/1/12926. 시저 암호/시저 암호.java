

class Solution {
    public char abcd(char a, int n){
        if(a == ' ') return ' ';
        if(a > 64 && a < 91){
            if(a + n >= 91){
                a -= 26;
                abcd(a,n);
            }
            return (char)(a + n);
        }
        if(a > 96){
            if(a + n > 122){
                a -= 26;
                abcd(a,n);
            }
            return (char)(a + n);
        }
        
        return a;
    }
    
    public String solution(String s, int n) {
        String answer = "";
        char[] split = s.toCharArray();        
        
        for(char sissor : split){
            answer += abcd(sissor,n);
            // if(sissor == ' ') {
            //     answer += ' ';
            // } 
            // else if(sissor + n > 90 && sissor + n < 97){                
            //     sissor = (char)(64 + n);                
            //     answer += sissor;
            // } else if(sissor + n > 122){
            //     answer += (char)(96 + n);
            // } else {
            //     answer += (char)(sissor + n);
            // }
        }
        return answer;
    }
}