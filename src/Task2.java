import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Task2 {
    private static int n;
    private static BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    private static int currentNumber = 1;


    public Task2() {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }


    public static void fizz() {
        while (currentNumber <= n) {
            if (currentNumber % 3 == 0 && currentNumber % 5 != 0) {
                queue.add("fizz");
                currentNumber++;
            }
        }
    }

    public static void buzz() {
        while (currentNumber <= n) {
            if (currentNumber % 5 == 0 && currentNumber % 3 != 0) {
                queue.add("buzz");
                currentNumber++;
            }
        }
    }

    public static void fizzbuzz() {
        while (currentNumber <= n) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                queue.add("fizzbuzz");
                currentNumber++;
            }
        }
    }

    public static void number() {
        while (currentNumber <= n) {
            if (currentNumber % 3 != 0 && currentNumber % 5 != 0) {
                queue.add(Integer.toString(currentNumber));
                currentNumber++;
            }
        }
    }

    public void print() {
        for (int i = 1; i <= n; i++) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
