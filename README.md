# Leetcode_solutions

My solutions to leetcode problems
Find my Leetcode solution here: https://leetcode.com/u/s_diya/

# Problems to solve

Blind75 problems: https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions

String problems: https://leetcode.com/discuss/interview-question/2001789/collections-of-important-string-questions-pattern

Array Patterns: https://leetcode.com/discuss/study-guide/4039411/14-Patterns-to-Ace-Any-Coding-Interview-Question; https://vaibhavsingh-54243.medium.com/the-array-cheatsheet-4d2b671dbde5

When solving coding assessments, mastering different **array patterns** is crucial. Here are some common patterns that frequently appear in technical interviews:

---

## **1. Two Pointers Pattern**

Used for problems involving **searching, sorting, or merging** in sorted arrays.

✅ **Common Problems:**

- Find a pair with a given sum (`Two Sum - sorted array`)
- Check if a string is a palindrome
- Merge two sorted arrays

🔹 **Example: Finding a pair with sum = target**

```java
public static boolean hasPairWithSum(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) return true;
        else if (sum < target) left++;
        else right--;
    }
    return false;
}
```

🔹 **Time Complexity:** `O(n)`

---

## **2. Sliding Window Pattern**

Used for problems that involve **subarrays, substrings, or continuous sequences.**

✅ **Common Problems:**

- Maximum sum of a subarray of size `k`
- Longest substring with at most `k` distinct characters
- Smallest subarray with a given sum

🔹 **Example: Maximum sum of subarray of size k**

```java
public static int maxSumSubarray(int[] arr, int k) {
    int maxSum = 0, windowSum = 0;
    for (int i = 0; i < arr.length; i++) {
        windowSum += arr[i];
        if (i >= k - 1) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= arr[i - (k - 1)];
        }
    }
    return maxSum;
}
```

🔹 **Time Complexity:** `O(n)`

---

## **3. Prefix Sum Pattern**

Used to efficiently compute **sum queries** in an array.

✅ **Common Problems:**

- Sum of a subarray in `O(1)`
- Range sum queries
- Equilibrium index

🔹 **Example: Compute sum of subarray [L, R] efficiently**

```java
public static int[] prefixSum(int[] arr) {
    int[] prefix = new int[arr.length];
    prefix[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i - 1] + arr[i];
    }
    return prefix;
}
```

🔹 **Time Complexity:** `O(n)`

---

## **4. Hashing (Using HashMap or HashSet)**

Used for problems that involve **frequency counting, finding duplicates, and looking up values in O(1) time.**

✅ **Common Problems:**

- Two Sum (Unsorted array)
- Longest Substring Without Repeating Characters
- Finding duplicates

🔹 **Example: Two Sum using HashMap**

```java
public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{-1, -1}; // No solution found
}
```

🔹 **Time Complexity:** `O(n)`

---

## **5. Sorting + Binary Search**

Used when problems involve **searching efficiently in sorted arrays.**

✅ **Common Problems:**

- Find an element in a rotated sorted array
- First and last occurrence of an element
- Searching in a nearly sorted array

🔹 **Example: Binary Search in Sorted Array**

```java
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

🔹 **Time Complexity:** `O(log n)`

---

## **6. Kadane’s Algorithm (Maximum Subarray Sum)**

Used to find the **maximum sum subarray in O(n) time**.

✅ **Common Problems:**

- Maximum Subarray Sum (Kadane’s Algorithm)
- Maximum Product Subarray

🔹 **Example: Maximum Subarray Sum**

```java
public static int maxSubArray(int[] nums) {
    int maxSum = nums[0], currentSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
}
```

🔹 **Time Complexity:** `O(n)`

---

## **7. Monotonic Stack (Next Greater Element Pattern)**

Used for problems that involve **finding the next greater/smaller element** efficiently.

✅ **Common Problems:**

- Next Greater Element
- Stock Span Problem
- Largest Rectangle in Histogram

🔹 **Example: Next Greater Element**

```java
public static int[] nextGreaterElement(int[] nums) {
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[nums.length];

    for (int i = nums.length - 1; i >= 0; i--) {
        while (!stack.isEmpty() && stack.peek() <= nums[i]) {
            stack.pop();
        }
        result[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(nums[i]);
    }
    return result;
}
```

🔹 **Time Complexity:** `O(n)`

---

## **8. Merge Intervals Pattern**

Used for problems involving **overlapping intervals or scheduling conflicts.**

✅ **Common Problems:**

- Merge Intervals
- Insert Interval
- Meeting Rooms

🔹 **Example: Merge Overlapping Intervals**

```java
public static int[][] mergeIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> merged = new ArrayList<>();

    for (int[] interval : intervals) {
        if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
            merged.add(interval);
        } else {
            merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
        }
    }
    return merged.toArray(new int[merged.size()][]);
}
```

🔹 **Time Complexity:** `O(n log n)`

---

### **Conclusion**

Mastering these patterns will help you tackle **90% of array-related coding problems.** Here’s a quick **summary:**
| **Pattern** | **Use Case** | **Time Complexity** |
|------------|------------|------------------|
| Two Pointers | Searching in sorted arrays | `O(n)` |
| Sliding Window | Subarray & substring problems | `O(n)` |
| Prefix Sum | Range sum queries | `O(n)` |
| Hashing | Fast lookups, duplicates, two sum | `O(n)` |
| Sorting + Binary Search | Search efficiently | `O(log n)` |
| Kadane’s Algorithm | Max subarray sum | `O(n)` |
| Monotonic Stack | Next greater element | `O(n)` |
| Merge Intervals | Overlapping intervals | `O(n log n)` |

Let me know if you need more details on any pattern! 🚀🔥

# Problems solved that beat 100%

1. Merge Sorted Arrays: https://leetcode.com/problems/merge-sorted-array/description/

- Solution post: https://leetcode.com/problems/merge-sorted-array/solutions/6079524/java-solution-using-two-pointers-beats-100

2. Remove Element: https://leetcode.com/problems/remove-element/description/

- Solution post: https://leetcode.com/problems/remove-element/solutions/6070602/java-solution-beats-100

3. Matrix Diagonal Sum: https://leetcode.com/problems/matrix-diagonal-sum/description/

- Solution post: https://leetcode.com/problems/matrix-diagonal-sum/solutions/

4. Substrings of Size Three with Distinct Characters: https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/

- Solution post: https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/solutions/5136773/beginner-friendly-sliding-window-technique

5. Squares of a Sorted Array:https://leetcode.com/problems/squares-of-a-sorted-array/description/

- Solution: https://leetcode.com/problems/squares-of-a-sorted-array/solutions/6092242/java-solution-beats-100-two-pointer-solution
