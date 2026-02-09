# Leetcode Solutions
## Session 1
### [Two Sum](https://leetcode.com/problems/two-sum/)
```java
	// Leetcode Two Sum
	import java.util.HashMap;
	import java.util.Map;
	
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            
	            if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i };
	            }
	            
	            map.put(nums[i], i);
	        }
	        
	        return new int[] {}; // will never reach here as per problem
		}
	}
```

### [Power of Two](https://leetcode.com/problems/power-of-two)
#### Approach 1
```java
	// Leetcode Power of Two
	class Solution {
	    public boolean isPowerOfTwo(int n) {
	        if (n <= 0) return false;
	        return (n & (n - 1)) == 0;
	    }
	}
```

**Note: Because powers of two have exactly one set bit in binary. Subtracting 1 flips all lower bits, and AND makes it zero.**

		n = 8
		n     = 1000 (binary)
		n - 1 = 0111 (binary)
		----------------
		AND   = 0000
#### Approach 2
```java
	class Solution {
	    public boolean isPowerOfTwo(int n) {
	        if (n <= 0) return false;
	        
	        while (n % 2 == 0) {
	            n /= 2;
	        }
	        
	        return n == 1;
	    }
	}
```



