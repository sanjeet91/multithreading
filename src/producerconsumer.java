public class producerconsumer {
    boolean available = false;
    int data = 0;
    public synchronized void producer(int value) throws  Exception{
        while (available){
            wait();
        }
        data = value;
        System.out.println(data);
        available = true;
        notifyAll();
    }

public synchronized void consumer() throws  Exception
{


    while (!available){
        wait();

    }

    available = false;
    notifyAll();

}
}