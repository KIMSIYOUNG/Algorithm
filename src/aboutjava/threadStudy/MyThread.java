package aboutjava.threadStudy;

/**
 * Thread class 를 상속받아 구현한 Thread
 * Main thread가 끝나는 것과 관계없이 자신의 일을 처리함.
 * 처리순서가 정해져있는 것이 아님. *과-가 언제 찍힐지 모른다.
 */
public class MyThread extends Thread{
    String str;

    public MyThread(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(str);
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
