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

//12.02.22
// Power of four https://leetcode.com/problems/power-of-four/
class Solution {
    public boolean isPowerOfFour(int n) {
                
        if(n == 0) return false;
        if(n == 1) return true;
        
        if(n % 4 != 0) return false;
        
        return isPowerOfFour(n/4);    
    }
}
//Power of Three https://leetcode.com/problems/power-of-three/
class Solution {
    public boolean isPowerOfThree(int n) {
                
        if(n == 0) return false;
        if(n == 1) return true;
        
        if(n % 3 != 0) return false;
        
        return isPowerOfThree(n/3);    
    }
}

//Find Target Indices After Sorting Array
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
          Arrays.sort(nums);
	    ArrayList<Integer> ans = new ArrayList<Integer>();
		 
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) ans.add(i);
        }
        return ans;  
    }
}


