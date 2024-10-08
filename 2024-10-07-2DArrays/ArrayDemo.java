import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //Needed tests: arrToString 1D, arrToString 2D, countZeros2D, arr2DSum, replaceNegative, copy1D, copy2D, swapRC, htmlTable

    //arrToString 1D Test

    int[] arr1D = new int[] {1,2,3,4};
    int[][] arr2D = new int[][] {{1,2,4,6}, {20000,459,103}, {34}, {0,0,0,0}};
    int[][] arr2Da = new int[][] {{100,200,300}, {300,400,500}};
    System.out.println("\n1D arrToString test");
    System.out.println("Test 01: \nExpected : " + Arrays.toString(arr1D) + "\nRecieved: " + arrToString(arr1D));
    System.out.println("\n2D arrToString test");
    System.out.println("Test 01: \nExpected : " + Arrays.deepToString(arr2D) + "\nRecieved: " + arrToString(arr2D));
    System.out.println("\nTest 02: \nExpected : " + Arrays.deepToString(arr2Da) + "\nRecieved: " + arrToString(arr2Da));
    System.out.println("\ncountZeros2D test");
    System.out.println("Test 01: \nExpected : " + 4 + "\n Recieved: " + countZeros2D(arr2D));
    System.out.println("\nTest 02: \nExpected : " + 1800 + "\n Recieved: " + countZeros2D(arr2Da));
    System.out.println("\nreplaceNegative test");
    System.out.println("Test 01: \nExpected : " + Arrays.deepToString(arr2D) + "\nRecieved: " + arrToString(arr2D));
    System.out.println("\nTest 02: \nExpected : " + Arrays.deepToString(arr2Da) + "\nRecieved: " + arrToString(arr2Da));
    System.out.println("\ncopy1D test");
    System.out.println( "Test 01: \nExpected : " + Arrays.toString(arr1D) + "\nRecieved: " + Arrays.toString(copy(arr1D)));
    System.out.println("\ncopy2D test");
    System.out.println("Test 01: \nExpected : " + Arrays.deepToString(arr2D) + "\nRecieved: " + Arrays.deepToString(copy(arr2D)));
    System.out.println("\nTest 02: \nExpected : " + Arrays.deepToString(arr2Da) + "\nRecieved: " + Arrays.deepToString(copy(arr2Da)));
    System.out.println("\nswapRC test");
    System.out.println("\nTest 01: \nExpected : " + "[[100, 300], [200, 400], [300, 500]]" + "\nRecieved: " + Arrays.deepToString((swapRC(arr2Da))));
    System.out.println("\nhtmlTable test");
    System.out.println("Test 01: \nExpected : " + "<table><tr><td>1</td><td>2</td><td>4</td><td>6</td></tr<tr><td>20000</td><td>459</td><td>103</td></tr<tr><td>34</td></tr<tr><td>0</td><td>0</td><td>0</td><td>0</td></tr</table" + "\nRecieved: " + htmlTable(arr2D));
    System.out.println("\nTest 02: \nExpected : " + "<table><tr><td>100</td><td>200</td><td>300</td></tr><tr><td>300</td><td>400</td><td>500</td></tr></table>" + "\nRecieved: " + htmlTable(arr2Da));


  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i ++) {
      result += ary[i];
      if (i < ary.length - 1) {
         result += ", ";
       }
     }
     result += "]";
     return result;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String result = "[";
    for (int i = 0; i < ary.length; i ++) {
      result += arrToString(ary[i]);
      if (i < ary.length - 1) {
	       result += ", ";
      }
    }
    result += "]";
    return result;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i ++) {
      for (int j = 0; j < nums[i].length; j ++) {
        if (nums[i][j] == 0) {
          sum ++;
        }
      }
    }
    return sum;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
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

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i ++) {
      for (int j = 0; j < vals[i].length; j ++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }


  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copy(int[] nums) {
    int[] result = new int [nums.length];
    for (int i = 0; i < nums.length; i ++) {
      result[i] = nums[i];
    }
    return result;
  }

  public static int[][] copy(int[][] nums){
    int[][] result = new int [nums.length][];
    for (int i = 0; i < nums.length; i ++) {
      result[i] = copy(nums[i]);
    }
    return result;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int j = 0; j < nums[0].length; j ++) {
      for (int i = 0; i < nums.length; i ++) {
        result[j][i] = nums[i][j];
      }
    }
   return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i ++) {
      result += "<tr>";
      for (int j = 0; j < nums[i].length; j ++) {
        result += "<td>";
        result += nums[i][j];
        result += "</td>";
      }
      result += "</tr";
    }
    result += "</table>";
    return result;
  }
}
