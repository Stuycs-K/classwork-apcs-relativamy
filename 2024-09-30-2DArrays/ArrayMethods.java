// Amy Zhou [azhou60@stuy.edu] & Jeffery Zhang [jzhang60@stuy.edu]

public class ArrayMethods {
  public static void main (String[] args) {
    int[][] arr = new int[][] {{2, 7}, {3, 6, 1}, {0, 0, 0, 0}}
    System.out.println("Test01: " + arr2DSum()
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
      for(int j = 0; i < nums[i].length; j++)
      {
        sum += nums[i][j];
      }
    }
    return sum;
  }
}

