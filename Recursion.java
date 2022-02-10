// 1. Reverse String   https://leetcode.com/problems/reverse-string/
class Solution {
    public void reverseString(char[] s) {
      
      for(int i=0;i<s.length/2;i++){
          char tmp = s[i];
            s[i] = s[s.length-1-i];     
            s[s.length-1-i] = tmp;      
      }
    }
}

//2. Fibonacci Number    https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int N) {
         if(N <= 1)
            return N;
        else
            return fib(N - 1) + fib(N - 2);
      
       }
    
}
//3. Power of two https://leetcode.com/problems/power-of-two/
class Solution {
	public boolean isPowerOfTwo(int n) {
		if(n==1){
            return true;
        }
		if(n==0){
            return false;
        }
		if(n%2!=0){
            return false;
        }
		else{ 
            return isPowerOfTwo(n/2);
        }

	}
}
