import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray (int size) {
    ArrayList<String>result =  new ArrayList<String>(size);
    for (int i = 0; i < size; i ++) {
      int val = (int)(Math.random()*11);
      if (val == 0) {
        result.add("");
      }
      else {
        result.add(""+val);
    }
  }
  return result;
  }

  public static void replaceEmpty( ArrayList<String> original){
   //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  }
}
