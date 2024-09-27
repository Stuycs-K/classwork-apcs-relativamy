public class MyArrays {
        public static void main (String[] args) {
          int[] test = new int[3];
          System.out.println(arrayToString(test));
		      int[] tester = {1, 2, 3};
		      System.out.println(tester == returnCopy(tester) && tester.equals(returnCopy(tester)));
          int[] concatTest1 = new int[] {100,100,100};
          int[] concatTest2 = new int [] {99,99,99};
          System.out.println(concatArray(concatTest1, concatTest2));
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

	public static int[] returnCopy(int[] ary) {
		int[] result = new int[ary.length];
		for (int i = 0; i < ary.length; i ++) {
			result[i] = ary[i];
		}
		return result;
	}

  public static int[] concatArray (int[]ary1, int[]ary2) {
    int[] result = new int [ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      result[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i ++) {
      result[i+ary1.length] = ary2[i];
    }
    return result;
  }
}
