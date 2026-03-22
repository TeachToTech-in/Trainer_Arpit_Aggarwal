# Leetcode Solutions
### Problem 1 - [Two Sum](https://leetcode.com/problems/two-sum/)
```java
	// Leetcode Two Sum
	class Solution {
		public int[] twoSum(int[] nums, int target) {
			for(int i = 0; i < nums.length - 1; i++) {
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
	        
	        return n == 1;
	    }
	}
```
### Problem 3 - [Palindrome Number](https://leetcode.com/problems/palindrome-number/)
```java
	// Leetcode Palindrome Number
	class Solution {
		public boolean isPalindrome(int x) {
			int digit, rev = 0;
			int x_save = x;
			
			if(x < 0) {
				return false;
			}
			
			while(x != 0) {
				digit = x % 10;
				rev = rev*10 + digit;
				x = x / 10;
			}
			
			return x_save == rev;
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
			int rev = 0;
			while(x != 0) {
			    int digit = x % 10;
			    x = x / 10;
			    if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
				    return 0;
				}
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
```java
	// Leetcode Single Number
	class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for(int num : nums) {
            result = result ^ num;
        }
        
        return result;
    }
}
```
### Problem 8 - [Plus One](https://leetcode.com/problems/plus-one/description/)
```java
	// Leetcode Plus One
	class Solution {
		public int[] plusOne(int[] digits) {
			int n = digits.length;
			for(int i = n-1; i >= 0; i--) {
				if(digits[i] < 9) {
					digits[i]++;
					return digits;
				}
				digits[i] = 0;
			}
			
			int newDigits[] = new int[n+1];
			newDigits[0] = 1;
			return newDigits;
		}
	}
```
### Problem 9 - [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/description/)
```java
	// Leetcode Fizz Buzz
	class Solution {
		public List<String> fizzBuzz(int n) {
			List<String> result = new ArrayList<>();
			
			for (int i = 1; i <= n; i++) {
				if (i % 15 == 0) {
					result.add("FizzBuzz");
				} else if (i % 3 == 0) {
					result.add("Fizz");
				} else if (i % 5 == 0) {
					result.add("Buzz");
				} else {
					result.add(Integer.toString(i));
				}
			}
			
			return result;
		}
	}
```
### Problem 10 - [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)
```java
	// Leetcode Best Time to Buy and Sell Stock
	class Solution {
		public int maxProfit(int[] prices) {
			int minPrice = Integer.MAX_VALUE;
			int maxProfit = 0;
			for (int price : prices) {
				if (price < minPrice) {
					minPrice = price;
				} else if (price - minPrice > maxProfit) {
					maxProfit = price - minPrice;
				}
			}
			return maxProfit;
		}
	}
```
### Problem 11 - [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/)
```java
	// Leetcode Valid Anagram
	class Solution {
		public boolean isAnagram(String s, String t) {
			if (s.length() != t.length()) return false;
			
			char[] a = s.toCharArray();
			char[] b = t.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			return Arrays.equals(a, b);
		}
	}
```
### Problem 12 - [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)
```java
	// Leetcode First Unique Character in a String
	class Solution {
		public int firstUniqChar(String s) {
			HashMap<Character, Integer> map = new HashMap<>();
			
	        for (char c : s.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	        
	        for (int i = 0; i < s.length(); i++) {
	            if (map.get(s.charAt(i)) == 1) {
	                return i;
	            }
	        }
		    return -1;
	    }
	}
```
### Problem 13 - [Move Zeroes](https://leetcode.com/problems/move-zeroes/)
```java
	// Leetcode Move Zeros
	class Solution {
	    public void moveZeroes(int[] nums) {
	        int j = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[j++] = nums[i];
	            }
	        }
	        while (j < nums.length) {
	            nums[j++] = 0;
	        }
	    }
	}
```
### Problem 14 - [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
```java
	// Leetcode Search Insert Position
	class Solution {
	    public int searchInsert(int[] nums, int target) {
	        int low = 0, high = nums.length - 1;
	        
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            
	            if (nums[mid] == target) {
	                return mid;
	            } 
	            else if (nums[mid] < target) {
	                low = mid + 1;
	            } 
	            else {
	                high = mid - 1;
	            }
	        }
	        return low;
	    }
	}
```
### Problem 15 - [Remove Element](https://leetcode.com/problems/remove-element/)
```java
	// Leetcode Remove Element
	class Solution {
	    public int removeElement(int[] nums, int val) {
	        int k = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }
	        return k;
	    }
	}
```
### Problem 16 - [Length of Last Word](https://leetcode.com/problems/length-of-last-word/)
```java
	// Leetcode Length of Last Word
	class Solution {
	    public int lengthOfLastWord(String s) {
	        int length = 0;
	        int i = s.length() - 1;
	        
	        while (i >= 0 && s.charAt(i) == ' ') {
	            i--;
	        }
	        
	        while (i >= 0 && s.charAt(i) != ' ') {
	            length++;
	            i--;
	        }
	        
	        return length;
	    }
	}
```
### Problem 17 - [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
```java
	// Leetcode Richest Customer Wealth
	class Solution {
	    public int maximumWealth(int[][] accounts) {
	        int maxWealth = 0;
	        
	        for (int[] customer : accounts) {
	            int sum = 0;
	            for (int money : customer) {
	                sum += money;
	            }
	            maxWealth = Math.max(maxWealth, sum);
	        }
	        
	        return maxWealth;
	    }
	}
```
### Problem 18 - [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
```java
	// Leetcode Climbing Stairs
	class Solution {
	    public int climbStairs(int n) {
	        if (n <= 2) return n;
	        
	        int prev1 = 2; // f(2)
	        int prev2 = 1; // f(1)
	        
	        for (int i = 3; i <= n; i++) {
	            int curr = prev1 + prev2;
	            prev2 = prev1;
	            prev1 = curr;
	        }
	        
	        return prev1;
	    }
	}
```

