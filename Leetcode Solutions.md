# Leetcode Solutions
### Problem 1 - [Two Sum](https://leetcode.com/problems/two-sum/)
```java
	// Leetcode Two Sum
	class Solution {
		public int[] twoSum(int[] nums, int target) {
			for(int i = 0; i < nums.length; i++) {
				for(int j = i + 1; j < nums.length; j++) {
					if(nums[i] + nums[j] == target) {
						return new int[] {i, j};
					}
				}
			}
			
			return new int[] {};
		}
	}
```
### Problem 2 - [Power of Two](https://leetcode.com/problems/power-of-two)
```java
	// Leetcode Power of Two
	class Solution {
	    public boolean isPowerOfTwo(int n) {
	        if(n <= 0) {
		        return false;
		    }
	        
	        while (n % 2 == 0) {
	            n = n / 2;
	        }
	        
	        if(n == 1) {
		        return true;
	        } else {
		        return false;
	        }
	    }
	}
```
### Problem 3 - [Palindrome Number](https://leetcode.com/problems/palindrome-number/)
```java
	// Leetcode Palindrome Number
	bool isPalindrome(int x) {
		int digit, rev = 0;
		int x_save = x;
		
		if(x < 0) {
			return false;
		}
		
		while(x != 0) {
			digit = x % 10;
			rev = rev * 10 + digit;
			x = x / 10;
		}
		
		if(x_save == rev){
			return true;
		} else {
			return false;
		}
	}
```
### Problem 4 - [Add Digits](https://leetcode.com/problems/add-digits/)
```java
	// Leetcode Add Digits
	class Solution {
		public int addDigits(int num) {
			int digit;
			
			while(num >= 10){
				int sum = 0;
				while(num > 0) {
					digit = num % 10;
					sum = sum + digit;
					num = num / 10;
				}
				num = sum;
			}
			return num;
		}
	}
```
### Problem 5 - [Reverse Integer](https://leetcode.com/problems/reverse-integer/)
```java
	// Leetcode Reverse Integer
	class Solution {
		public int reverse(int x) {
			int digit, rev = 0;
			
			while(x != 0) {
				digit = x % 10;
				x = x / 10;
				rev = rev*10 + digit;
			}
			
			return rev;
		}
	}
```
### Problem 6 - [Number of Steps](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)
```java
	// Leetcode Number of Steps
	class Solution {
		public int numberOfSteps(int num) {
			int step = 0;
			
			while(num > 0) {
				if(num % 2 == 0) {
					num = num / 2;
				} else {
					num = num - 1;
				}
				step++;
			}
			return step;
		}
	}
```
### Problem 7 - [Single Number](https://leetcode.com/problems/single-number/description/)

### Problem 8 - [Plus One](https://leetcode.com/problems/plus-one/description/)
### Problem 9 - [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/description/)


