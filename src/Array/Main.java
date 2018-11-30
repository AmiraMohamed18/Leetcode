package Array;

import java.util.HashMap;
import java.util.Map;

public class Main {

//	1	Two Sum    

	public int[] twoSum (int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)){
				return new int[] {
						map.get(complement) , i
				};
			}
			map.put(nums[i], i); 
		}		
		return new int[]{};
	}
	// time complexity O(n)
	// space complexity O(n), according to hash table 
	// which stores at most n elements 
	
//	3	Longest Substring Without Repeating Characters    
/*
 * Given a string, find the length of the longest substring 
 * without repeating characters.
 * */
	
	
//	36	Valid Sudoku    
//	49	Group Anagrams    
//	76	Minimum Window Substring    
//	94	Binary Tree Inorder Traversal    
//	136	Single Number    
//	138	Copy List with Random Pointer    
//	149	Max Points on a Line    
//	166	Fraction to Recurring Decimal    
//	202	Happy Number    
//	204	Count Primes    
//	217	Contains Duplicate    
//	242	Valid Anagram    
//	340	Longest Substring with At Most K Distinct Characters    
//	347	Top K Frequent Elements    
//	350	Intersection of Two Arrays II    
//	380	Insert Delete GetRandom O(1)    
//	387	First Unique Character in a String    
//	454	4Sum II    

	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	

	}
}
