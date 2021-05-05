import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("==========================================================");
        System.out.println("                Comparing Fibnacci Algos                  ");
        System.out.println("==========================================================");
        System.out.println("");
        System.out.println("Enter Ordinal Position in Fibonacci Sequence: ");

        String str;
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        s.close();

        int n = Integer.parseInt(str);

        //for (int n =0; n<=20; n++){
        //int n=7;
        //Fibs.fib2(n);
        System.out.println("n= " + n + "; Fibs2(n): " +  Fibs.fib2(n) + "; count: " + Fibs.count2);

        //Fibs.fib3(n);
        System.out.println("n= " + n + "; Fibs3(n): " +  Fibs.fib3(n) + "; count: " + Fibs.count3);

        //Fibs.fib4(n);
        System.out.println("n= " + n + "; Fibs4(n): " +  Fibs.fib4(n) + "; count: " + Fibs.count4);

        //}
    }

/*    private static Map<Integer, Integer> memo;
    static {
        memo= new HashMap<>();
        memo.put(0,0);
        memo.put(1,1);
    }
    private static int fib3(int n) {
        if (!memo.containsKey(n)) {
            // memoization step
            memo.put(n, fib3(n - 1) + fib3(n - 2));
        System.out.println(n + " ," + memo.get(n));
        }
        return memo.get(n);
    }*/
}