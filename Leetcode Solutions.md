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

