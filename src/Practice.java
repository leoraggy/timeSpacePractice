import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n) where n is length of array
  // Space Complexity: O(n) where n is length of array
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n) where n is the length of the matrix
  // Space Complexity: O(1) where 1 represents the number of constant variables
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n) where n is the length of array
  // Space Complexity: O(n) where n is the length of array
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2) where n is the number n
  // Space Complexity: O(n) where n is the size of the evens ArrayList
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    Map<Integer, Integer> counterMap = new LinkedHashMap<>();

    for(int num: nums){
      counterMap.put(num, counterMap.getOrDefault(num, 0) + 1);
    }

    int mostCommon = 0;

    for(int num: counterMap.values()){
      if(num > mostCommon){
        mostCommon = num;
      }

    }

    return mostCommon;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int currentHighestNum = 0;
    int highestCount = 0;
    int currentNum;
    int counter = 0;
    for (int i = 0; i < nums.length; i++){
      currentNum = nums[i];
      for (int j = i+1; j < nums.length; j++){
        if (nums[j] == nums[i]){
          counter++;
        }
      }
      if (counter > highestCount){
        highestCount = counter;
        currentHighestNum = currentNum;
      }
    }
    return currentHighestNum;
  }
}