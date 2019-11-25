package aboutjava.threadStudy;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();

        synchronized (threadB){
            System.out.println("B가 완료될 때 까지 기다립니다.");
            threadB.wait();
            System.out.println("Total is"+threadB.total);
        }

    }
}
