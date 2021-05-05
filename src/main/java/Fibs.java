import java.util.HashMap;
import java.util.Map;

public class Fibs {
    // Map.of() was introduced in Java 9 but returns
    // an immutable Map
    // This creates a map with 0->0 and 1->1
    // which represent our base cases
    public static int count2;
    public static int count3;
    public static int count4;

    private static Map<Integer, Integer> memo;
    static {
        memo= new HashMap<>();
        memo.put(0,0);
        memo.put(1,1);
    }

        static int fib3(int n) {
        if (!memo.containsKey(n)) {
            //memoization step
            count3=count3+1;
            memo.put(n, fib3(n - 1) + fib3(n - 2));
        }
        return memo.get(n);
    }

     static int fib4(int n) {
        int last = 0, next = 1; // fib(0), fib(1)
         //count4=count4+1;
         for (int i = 0; i < n; i++) {
             count4=count4+1;
             int oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }
         static int fib2(int n) {
            if (n < 2) { return n; }
            count2=count2+1;
            return fib2(n - 1) + fib2(n - 2);
        }

}
