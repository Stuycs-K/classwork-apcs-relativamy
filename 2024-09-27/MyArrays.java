public class MyArrays {
        public static void main (String[] args) {
                int[] test = new int[3];
                System.out.println(arrayToString(test)); 
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

}
