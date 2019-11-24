package aboutjava.threadStudy;

public class ThreadExam2 {
    public static void main(String[] args) {
        YourThread yourThread = new YourThread("**");
        YourThread yt = new YourThread("--");

        /**
         * 실행을 하기 위해서 쓰레드 클래스를 하나 생성해서 생성자 파라미터로 Runnable
         */
        Thread thread = new Thread(yourThread);
        Thread thread2 = new Thread(yt);

        thread.start();
        thread2.start();

        System.out.println("It's over");

    }
}
