package aboutjava.threadStudy;

public class Thread5 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Thread5 : "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
