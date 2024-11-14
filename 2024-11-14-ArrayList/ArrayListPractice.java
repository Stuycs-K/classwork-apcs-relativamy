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
   while (original.indexOf("")!=-1){
     int index = original.indexOf("");
     original.remove(index);
     original.add(index, "Empty");
   }
  }
}
