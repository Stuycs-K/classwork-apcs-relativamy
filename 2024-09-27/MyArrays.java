public class MyArrays {
        public static void main (String[] args) {
		System.out.println("returnCopy test:");
		int[] tester = new int[] {1,2,3,4,5};
        	System.out.println("Test 01: " + returnCopyTest(tester));
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

        public static String returnCopyTest(int[] arr) {
                if (arrayToString(arr).equals(arrayToString(arr)) && arr != returnCopy(arr)) {
                        return "Pass";
                }
		else if (arrayToString(arr).equals(arrayToString(arr)) && arr == returnCopy(arr)) {
			return "Failed, the copied and original string hold the same address";
		}
                else {
                        return "Failed, expected " + arr.toString() +"  but value was " +  arrayToString(arr);
                }
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

