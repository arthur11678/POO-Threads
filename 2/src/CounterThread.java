public class CounterThread extends Thread {
    private int id;
    Counter counter;

    public CounterThread(int id, Counter counter) {
        this.id = id;
        this.counter = counter;
    }

    public void run() {
        if (this.id == 1) {
            for (int i = 0; i < 20; i++) {
                counter.increment();
                try {
                    Thread.sleep((long) (Math.random() * 500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = 0; i < 20; i++) {
                counter.decrement();
                try {
                    Thread.sleep((long) (Math.random() * 500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

