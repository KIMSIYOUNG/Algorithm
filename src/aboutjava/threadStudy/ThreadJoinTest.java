package aboutjava.threadStudy;

public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread5 thread5 = new Thread5();
        thread5.start();

        System.out.println("메인쓰레드 시작");

        thread5.join();

        System.out.println("메인쓰레드 종료");
    }
}
