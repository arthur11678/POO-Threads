public class CounterUser {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        CounterThread incrementar = new CounterThread(1, counter);
        CounterThread decrementar = new CounterThread(2, counter);
        incrementar.start();
        decrementar.start();
    }
}
