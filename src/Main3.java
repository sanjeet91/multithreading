import java.security.spec.ECField;

public class Main3 {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            try {
                for (int i = 0; i < 500; i++) {
                    c.getincrement();
                }
            }
            catch(Exception e){

                }

        });
        Thread t2 = new Thread(()-> {
            try {
                for (int i = 0; i < 500; i++) {
                    c.getincrement();
                }
            } catch (Exception e) {

            }
        }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println( "Final Count: " + c.count);
    }
}
