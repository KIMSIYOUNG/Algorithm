package aboutjava.threadStudy;

public class DaemonThread implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("데몬쓰레드가 실행 중입니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DaemonThread());
        thread.setDaemon(true);
        thread.start();

        Thread.sleep(1000);
        System.out.println("Main Thread is gonna be over");
    }
}
