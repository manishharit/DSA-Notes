# Sliding Window Algorithm

## Template 1: **Fixed Size** - Finding a Subarray of a Given Size with Certain Conditions

### Problem Type :
- Given a fixed size `k`, find a subarray of size `k` that satisfies the given conditions.

### Approach:
1. **Initialize**:
    - Two pointers: `start` (left boundary) and `end` (right boundary) to represent the current window.
    - Any additional variables required for calculations (e.g., sum, result, etc.).

2. **Iterate**:
    - Loop through the array using the `end` pointer.

3. **Perform Calculations**:
    - Add or process the current element as needed for the problem.

4. **Expand the Window**:
    - Move the `end` pointer until the desired window size `k` is achieved.

5. **Process and Slide the Window**:
    - Once the window size equals `k`:
        - Perform the required calculations for the current window (e.g., calculate the result).
        - Slide the window by:
            - Removing the effect of the element at `start`.
            - Moving the `start` pointer forward.
        - Continue moving `end` to expand the window further.

6. **Complete the Loop**:
    - At the end of the loop, you will have your solution.

7. **Optimize**:
    - Refactor and optimize the code as needed.

8. **Problem Solution**:
   - Refer to the [FindMaxSumSubArray](./FindMaxSumSubArray.java) class for a concrete implementation of this template.
   - Refer to the [FirstNegativeSubArray](./FirstNegativeSubArray.java) class for advanced template version.
   - Refer to the [Anagram](./Anagram.java)
   - Refer to the [MaxElementOfSubArray](./MaxElementOfSubArray.java)

---

## Template 2: **Variable Window Size** - Finding Sub array's having Certain Conditions

### Problem Type :
- Window size is dynamic depending on the conditions provided. The goal is to find subarrays that satisfy certain conditions, and the window size adjusts accordingly.

### Approach:
1. **Initialize**:
   - Two pointers: `start` (left boundary) and `end` (right boundary) to represent the current window.
   - Any additional variables required for calculations (e.g., sum, result, etc.).

2. **Iterate**:
   - Loop through the array using the `end` pointer.
   - Adjust the window size dynamically as needed based on the condition.

3. **Perform Calculations**:
   - Figure out given condition in problem and convert it accordingly to use.

4. **Window Expansion**:
   - unlike fixed window problems.There will be 3 conditions.
   1. Window size less than condition - need to increase window size.
   2. Window size grater than condition - need to reduce window size.
   3. Window size equals to condition - this will give answer.

5. **Problem Solution**:
   - Refer to the [LongestSubArrayWithSumK](./LongestSubArrayWithSumK.java) to get basic idea for variable window
   - Refer to the [LongestSubStringWithUniqueK](./LongestSubStringWithUniqueK.java) class for a concrete implementation of this template.