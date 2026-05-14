public class Main4 {
    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {


            Singleton s1 = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()
                    + " -> " + s1);

        }
        );
        Thread t2 = new Thread(() -> {
            Singleton s2 = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()
                    + " -> " + s2);

        });
        t1.start();
        t2.start();
    }
}

