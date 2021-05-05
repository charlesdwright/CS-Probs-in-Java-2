public class utils {

    static void count(String theRoutine){
        setCounter(getCounter()+1);
        System.out.println("in " + theRoutine + "  " + getCounter());

    }

    static private int counter;
    private static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        counter = counter;
    }
}
