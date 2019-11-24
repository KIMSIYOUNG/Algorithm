package aboutjava.threadStudy;

public class ThreadExam {

    public static void main(String[] args) {
        MyThread thread = new MyThread("*");
        MyThread thread1 = new MyThread("--");

        thread.start();
        thread1.start();

        System.out.println("Everything is over");

    }
}
