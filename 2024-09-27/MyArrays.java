public class MyArrays {
        public static void main (String[] args) {
                int[] test = new int[3];
                System.out.println(arrayToString(test)); 
		int[] tester = {1, 2, 3};
		System.out.print(tester == returnCopy(tester));
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
}
