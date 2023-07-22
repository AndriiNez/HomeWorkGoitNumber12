public class Test {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.setN(15);


        Thread a = new Thread(Task2::fizz);

        Thread b = new Thread(Task2::buzz);

        Thread c = new Thread(Task2::fizzbuzz);

        Thread d = new Thread(Task2::number);

        a.start();
        b.start();
        c.start();
        d.start();

        task2.print();
    }
}