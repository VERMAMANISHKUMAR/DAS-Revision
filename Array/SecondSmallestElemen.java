import java.util.Arrays;

// Java program to find the second smallest element in an array
/*
          Java program to find the second smallest element in an array
          
          Given an array of integers, find the second smallest element in the array. 
          If there are duplicates, print any one of them.
          
          Example:
          
          Input: arr[] = {12, 30, 1, 110, 34, 1} 
          Output: 12
          
*/
public class SecondSmallestElemen {
          public static int findSecondSmallest(int[] arr) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
              if (arr[i] < first) {
                second = first;
                first = arr[i];
              } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
              }
            }
            return second;
          }

          public static void main(String[] args) {
            int[] arr = { 12, 30, 1, 110, 34, 1 };
            int secondSmallest = findSecondSmallest(arr);
            System.out.println("The second smallest element is: " + secondSmallest);
          }
}


// Time Complexity: O(n)
// Space Complexity: O(1)

//Second method


