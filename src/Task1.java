public class Task1 {
    public static void main(String[] args) {
        Thread timer = new Thread(() -> {
            long startT = System.currentTimeMillis();
            while (true) {
                long currentT = System.currentTimeMillis();
                long pasT = (currentT - startT) / 1000;
                System.out.println("Час, що минув : " + pasT + " секунд");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread messageThread = new Thread(() -> {
            while (true) {

                try {
                    Thread.sleep(5000);
                    System.out.println("Минуло 5 секунд");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        timer.start();
        messageThread.start();

    }


}
