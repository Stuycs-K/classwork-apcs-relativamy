// Amy Zhou [azhou60@stuy.edu] & Jeffery Zhang [jzhang60@stuy.edu]

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
   
  }
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

  public static int arr2DSum(int[][] nums){
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
    int[] results = new int[] {19, 30, 65, 198, 0};
    if (results[n] == arr2DSum(nums)) {
       return "Pass";
    } else {
       return "Failed, expected " + results[n] + " but recieved " + arr2DSum(nums);
    }
  }
}


