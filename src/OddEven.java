public class OddEven {
    int number = 1;

    public synchronized void even() throws Exception {
        while (number <= 10) {
            while (number % 2 != 0) {
                wait();

            }
            System.out.println(number);
            number++;
            notifyAll();
        }
    }

    public synchronized void odd() throws Exception {
        while (number <= 10) {
            while (number % 2 == 0) {
                wait();
            }
            System.out.println(number);
            number++;
            notifyAll();
        }
    }
}
