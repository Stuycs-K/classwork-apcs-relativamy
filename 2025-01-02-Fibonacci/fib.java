public class fib {
  public static void main (String[] args) {
    fibonacci(Integer.parseInt(args[0]));
  }
  public static int fibonacci (int n) {
    if (n < 2) {
      return n;
    }
    else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
}
