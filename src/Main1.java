public class Main1 {
    public static void main(String[] args) {
        producerconsumer pc = new producerconsumer();
        Thread t1 = new Thread(()->{
            try {
                for (int i = 0; i < 5; i++) {
                    pc.producer(i);
                }
            }
            catch (Exception e){

            }
        }
        );
        Thread t2 = new Thread(()->{
            try{
            for(int i = 0; i < 5; i++){
                pc.consumer();
            }

        }
            catch (Exception e) {
            }
            });
        t1.start();
        t2.start();
        }
    }

