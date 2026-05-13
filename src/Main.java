//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws  Exception {
OddEven c1 = new OddEven();
Thread
        t1 = new Thread(()-> {
            try {
                c1.odd();
            } catch (Exception e) {

            }


        }
        );
Thread t2 = new Thread(()->{
    try{
        c1.even();
    }
    catch (Exception e){

    }
}
);
t1.start();
t2.start();
t1.join();
t2.join();
    }
}