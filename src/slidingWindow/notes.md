# Sliding Window Algorithm

## Template 1: **Fixed Size** - Finding a Subarray of a Given Size with Certain Conditions

### Problem Type:
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
   - Refer to **FindMaxSumSubArray** as a concrete example of how this template is applied.
   - Refer to the [FindMaxSumSubArray.java](./FindMaxSumSubArray.java) class for a concrete implementation of this template.
   - Refer to the [FirstNegativeSubArray.java](./FirstNegativeSubArray.java) class for advanced template version.
   - Refer to the [Anagram](./Anagram.java)