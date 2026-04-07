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
### Problem 19 - [Smallest Even Multiple](https://leetcode.com/problems/smallest-even-multiple/)
```java
	// Leetcode Smallest Even Multiple
	class Solution {
	    public int smallestEvenMultiple(int n) {
	        if(n % 2 == 0) {
	            return n;
	        } else {
	            return 2 * n;
	        }
	    }
	}
```
### Problem 20 - [Harshad Number](https://leetcode.com/problems/harshad-number/)
```java
	// Leetcode Harshad Number
	class Solution {
		public int sumOfTheDigitsOfHarshadNumber(int x) {
			int sum = 0;
			int x_save = x;
			
			while(x != 0) {
				int digit = x % 10;
				sum = sum + digit;
				x = x / 10;
			}
			
			if(x_save % sum == 0) {
				return sum;
			} else {
				return -1;
			}
		}
	}
```
### Problem 21 - [Count of Matches in Tournament](https://leetcode.com/problems/count-of-matches-in-tournament/)
```java
	// Leetcode Count Matches in Tournament
	class Solution {
		public int numberOfMatches(int n) {
			int matches = 0;
			
			while(n > 1) {
				if(n % 2 == 0) {
					matches = matches + n / 2;
					n = n / 2;
				} else {
					matches = matches + (n - 1) / 2;
					n = ((n - 1) / 2) + 1;
				}
			}
			return matches;
		}
	}
```
### Problem 22 - [Number of Common Factors](https://leetcode.com/problems/number-of-common-factors/)
```java
	// Leetcode Number of Common Factors
	class Solution {
	    public int commonFactors(int a, int b) {
	        int count = 0;
	        int min = Math.min(a, b);
	        
	        for(int i = 1; i <= min; i++) {
	            if(a % i == 0 && b % i == 0) {
	                count++;
	            }
	        }
	        
	        return count;
	    }
	}
```
### Problem 23 - [Count Integers With Even Digit Sum](https://leetcode.com/problems/count-integers-with-even-digit-sum/)
```java
	// Leetcode Count Integers with Even Digit Sum
	class Solution {
		public int countEven(int num) {
			int count = 0;
			
			for(int i = 1; i <= num; i++) {
				int sum = 0;
				int temp = i;
				
				while(temp != 0) {
					int digit = temp % 10;
					sum = sum + digit;
					temp = temp / 10;
				}
				
				if(sum % 2 == 0) {
					count++;
				}
			}
			
			return count;
		}
	}
```
### Problem 24 - [Sign of the Product of an Array](https://leetcode.com/problems/sign-of-the-product-of-an-array/)
```java
	// Leetcode Sign of the Product of an Array
	class Solution {
		public int arraySign(int[] nums) {
			int sign = 1;
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] == 0) {
					sign = 0;
				} else if(nums[i] < 0) {
					sign = -sign;
				}
			}
			return signFunc(sign);
		}
		
		public static int signFunc(int product) {
			if(product < 0) {
				return -1;
			} else if(product > 0) {
				return 1;
			} else {
				return 0;
			}
		}
	}
```
### Problem 25 - [Difference Between Element Sum and Digit Sum](https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/)
```java
	// Leetcode Difference Between Element Sum and Digit Sum
	class Solution {
		public int differenceOfSum(int[] nums) {
			int elementSum = 0;
			int digitSum = 0;
			
			for(int i = 0; i < nums.length; i++) {
				elementSum = elementSum + nums[i];
				int num = nums[i];
				while(num > 0) {
					int digit = num % 10;
					digitSum = digitSum + digit;
					num = num / 10;
				}
			}
			return elementSum - digitSum;
		}
	}
```
### Problem 26 - [Sum of Digits in Base K](https://leetcode.com/problems/sum-of-digits-in-base-k/)
```java
	// Leetcode Sum of Digits in Base K
	class Solution {
		public int sumBase(int n, int k) {
			int sum = 0;
			
			while(n > 0) {
				sum += n % k;
				n = n / k;
			}
			
			return sum;
		}
	}
```
### Problem 27 - [Maximum 69 Number](https://leetcode.com/problems/maximum-69-number/)
```java
	// Leetcode Maximum 69 Number
	class Solution {
		public int maximum69Number (int num) {
			char[] arr = String.valueOf(num).toCharArray();
			for(int i = 0; i < arr.length; i++) {
				if (arr[i] == '6') {
					arr[i] = '9';
					break;
				}
			}
			return Integer.parseInt(new String(arr));
		}
	}
```
### Problem 28 - [Subtract the Product and Sum of Digits](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
```java
	// Leetcode Subtract the Product and Sum of Digits
	class Solution {
		public int subtractProductAndSum(int num) {
			int prod = 1;
			int sum = 0;
			
			while(num > 0) {
				int digit = num % 10;
				prod = prod * digit;
				sum = sum + digit;
				num = num / 10;
			}
			
			return prod - sum;
		}
	}
```
### Problem 29 - [Ugly Number](https://leetcode.com/problems/ugly-number/)
```java
	// Leetcode Ugly Number
	class Solution {
		public boolean isUgly(int n) {
			if (n <= 0) return false;
			int[] factors = {2, 3, 5};
			
			for (int f : factors) {
				while (n % f == 0) {
					n /= f;
				}
			}
			
			return n == 1;
		}
	}
```
### Problem 30 - [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
```java
	// Leetcode Number of Good Pairs
	class Solution {
		public int numIdenticalPairs(int[] nums) {
			int count = 0;
			for(int i = 0; i < nums.length; i++) {
				for(int j = i+1; j < nums.length; j++) {
					if(nums[i] == nums[j]) {
						count++;
					}
				}
			}
			return count;
		}
	}
```
### Problem 31 - [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
```java
	// Leetcode Find Numbers with Even Number of Digits
	class Solution {
		public int findNumbers(int[] nums) {
			int count = 0;
			
			for(int i = 0; i < nums.length; i++) {
				int num = nums[i];
				int noOfDigits = 0;
				
				while(num > 0) {
					noOfDigits++;
					num = num / 10;
				}
				
				if(noOfDigits % 2 == 0) {
					count++;
				}
			}
			return count;
		}
	}
```
### Problem 32 - [Final Value of Variable](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)
```java
	// Final Value of Variable
	class Solution {
		public int finalValueAfterOperations(String[] operations) {
			int x = 0;
			
			for(String op : operations) {
				if(op.equals("++X") || op.equals("X++")) {
					x++;
				} else {
					x--;
				}
			}
			return x;
		}
	}
```
### Problem 33 - [XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/)
```java
	// Leetcode XOR Operation in an Array
	class Solution {
		public int xorOperation(int n, int start) {
			int nums[] = new int[n];
			int result = 0;
			
			for(int i = 0; i < n; i++) {
				nums[i] = start + 2*i;
				result = result ^ nums[i];
			}
			
			return result;
		}
	}
```


