import java.util.Arrays;
//Given an Array of integers, write a java programe to find the second smallest element.
//
//        Input: arr[] = {12, 30, 1, 110, 34, 1}
//        Output: 12    
//time complexity is O(n)
//space complexity is O(1)
public class manish {

                    public static int findSecondSmallest(int[] arr) {
                        int secondSmallestElement = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid input"));
                        return secondSmallestElement;
                    }
                
                    public static void main(String[] args) {
                        int[] arr = {5 , 2 , 3 , 8 , 1 , 1};
                        int secondSmallest = findSecondSmallest(arr);
                        System.out.println("Second Smallest Element is: " + secondSmallest);
                    }
                }
                

