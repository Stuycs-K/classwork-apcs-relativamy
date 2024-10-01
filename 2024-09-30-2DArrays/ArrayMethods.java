//1. Amy Zhou [azhou60@stuy.edu] & Jeffery Zhang [jzhang60@stuy.edu]

import java.util.*;
public class ArrayMethods {
  public static void main (String[] args) {
    System.out.println("arr2DSum Tests: "); 
    int[][] arr = new int[][] {{2, 7}, {3, 6, 1}, {0, 0, 0, 0}};
    System.out.println("Test 01: " + arr2DSumTest(arr, 0));
    arr = new int[][] {{1,2,3}, {5,6,7}, {4, 2}};
    System.out.println("Test 02: " + arr2DSumTest(arr, 1));
    arr = new int[][] {{11,12}, {13,14,15}, {0,-1,2,32,-33}};       
    System.out.println("Test 03: " + arr2DSumTest(arr, 2));
    arr = new int[][] {{11,11,11}, {22,22,22}, {33,33,33}};
    System.out.println("Test 04: " + arr2DSumTest(arr, 3));
    arr = new int[][] {{-202,-204}, {100, 101, 102, 103}, {0,-1,1,-22,22}};
    System.out.println("Test 05: " + arr2DSumTest(arr, 4));
    arr = new int[][] {{}, {}, {}, {}};
    System.out.println("Test 06: " + arr2DSumTest(arr, 5));
    System.out.println(" ");
    System.out.println("arrToString[][] Tests: ");
    int[][] arr1 = new int[][] {{1,2,3,4,5,6}, {5,30}, {0, -11, 44}};
    System.out.println("Test 01: " + arrToStringTest(arr1));
    arr1 = new int[][] {{},{},{},{},{}};
    System.out.println("Test 02: " + arrToStringTest(arr1));
    arr1 = new int[][] {{1,2,5,7}, {-4,6,-99,100}};                                   
    System.out.println("Test 03: " + arrToStringTest(arr1));
    arr1 = new int[][] {{100,100,100,100,100}, {99,100,99,100,99,100}, {100,98,99,100,99}};  
    System.out.println("Test 04: " + arrToStringTest(arr1));
    arr1 = new int[][] {{22,222,2222,222}, {10000,9999, 9888}, {0000, 000, 0}};  
    System.out.println("Test 05: " + arrToStringTest(arr1));
    System.out.println(" ");
    System.out.println("swapRC Tests: ");
    int[][] arr2 = new int[][] {{1,2,3}, {4,5,6}}; 
    System.out.println("Test 01: " + swapRCTest(arr2, new int[][] {{1,4}, {2,5}, {3,6}}));
    arr2 = new int[][] {{7,8,9}, {10,11,12}, {13,14,15}};
    System.out.println("Test 02: " + swapRCTest(arr2, new int[][] {{7,10,13}, {8,11,14}, {9,12,15}}));
    arr2 = new int[][] {{1}};
    System.out.println("Test 03: " + swapRCTest(arr2, new int[][] {{1}}));
    arr2 = new int[][] {{1,2}, {3,4}, {5,6}, {7,8}};
    System.out.println("Test 04: " + swapRCTest(arr2, new int[][] {{1,3,5,7}, {2,4,6,8}}));
    arr2 = new int[][] {{10,20,30,40}, {50,60,70,80}};
    System.out.println("Test 05: " + swapRCTest(arr2, new int[][] {{10,50}, {20,60}, {30,70}, {40,80}}));
  }
 
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/

  public static String arrayToString(int[] arr) {
  String result = "[";
  for (int i = 0; i < arr.length; i ++) {
    result += arr[i];
    if (i < arr.length - 1) {
      result += ", ";
    }
  }
  result += "]";
  return result;
}

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String result = "[";
    for (int i = 0; i < ary.length; i ++) {
      result += arrayToString(ary[i]);
      if (i < ary.length - 1) {
	result += ", ";
      }
    }
    result += "]";
    return result;
  }

  public static String arrToStringTest(int[][]ary) {
    if (arrToString(ary).equals(Arrays.deepToString(ary))) {
      return "Pass";
    } else {
      return "Failed, expected " + Arrays.deepToString(ary) + " but recieved " + 
arrToString(ary);
    }
  }
  
  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][] nums){
  //use a nested loop to solve this
      int sum = 0;
    for(int i = 0; i < nums.length; i++)
    {
      for(int j = 0; j < nums[i].length; j++)
      {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  public static String arr2DSumTest(int[][] nums, int n) {
    int[] results = new int[] {19, 30, 65, 198, 0, 0};
    if (results[n] == arr2DSum(nums)) {
       return "Pass";
    } else {
       return "Failed, expected " + results[n] + " but recieved " + arr2DSum(nums);
    }
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int j = 0; j < nums[0].length; j ++) {
      for (int i = 0; i < nums.length; i ++) {
        result[j][i] = nums[i][j];
      }
    }
   return result;
  }

  public static String swapRCTest(int[][] input, int[][] expected) {
    int[][] result = swapRC(input);
    if (Arrays.deepEquals(result,expected)) {
      return "Pass";
    }
    else {
      return "Failed, expected " + arrToString(expected) + " but recieved " + arrToString(result);
   }
 }


}


