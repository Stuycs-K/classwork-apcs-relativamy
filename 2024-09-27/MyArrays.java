public class MyArrays {
        public static void main (String[] args) {
		System.out.println("returnCopy test:");
		int[] copyTester = new int[] {1,2,3,4,5};
        	System.out.println("Test 01: " + returnCopyTest(copyTester));
                copyTester = new int[] {4,5,7,18,3,-49};
                System.out.println("Test 02: " + returnCopyTest(copyTester));
                copyTester = new int[] {-101,23,45,3,2,1,566,79};           
                System.out.println("Test 02: " + returnCopyTest(copyTester));
                copyTester = new int[] {100,100,100,100,100};           
                System.out.println("Test 03: " + returnCopyTest(copyTester));
                copyTester = new int[] {99,99,99,99,99,100,999999};           
                System.out.println("Test 04: " + returnCopyTest(copyTester));
                copyTester = new int[] {11,22,33,44,55,66,77,88,99};
                System.out.println("Test 05: " + returnCopyTest(copyTester));
		System.out.println(" ");
		System.out.println("concatArray test:");
		int[] concatTester1 = new int[] {100,99,988};
		int[] concatTester2 = new int[] {101,98,223,222};
		System.out.println("Test 01: " + concatArrayTest(concatTester1, concatTester2, 0));
		concatTester1 = new int[] {1,2,3,4,5};
		concatTester2 = new int[] {6,7,8,9,10};
                System.out.println("Test 02: " + concatArrayTest(concatTester1, concatTester2, 1));
                concatTester1 = new int[] {};
                concatTester2 = new int[] {};
                System.out.println("Test 03: " + concatArrayTest(concatTester1, concatTester2, 2));
                concatTester1 = new int[] {-1,-7,1,3,5};      
                concatTester2 = new int[] {44,55,21,3,-5};          
                System.out.println("Test 04: " + concatArrayTest(concatTester1, concatTester2, 3));
                concatTester1 = new int[] {1};      
                concatTester2 = new int[] {2};          
                System.out.println("Test 05: " + concatArrayTest(concatTester1, concatTester2, 4));

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
	public static String concatArrayTest (int[]ary1, int[]ary2, int n) {
		String[] results = new String[] {
			"[100, 99, 988, 101, 98, 223, 222]", 
			"[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", 
			"[]", 
			"[-1, -7, 1, 3, 5, 44, 55, 21, 3, -5]", 
			"[1, 2]"
		};
		String expected = results[n];
		String actual = arrayToString(concatArray(ary1,ary2));
		if (expected.equals(actual)) {
			return "Pass";
		}
		else {
			return "Failed, expected " + expected + " but value was " + actual;
		}
	}
}


