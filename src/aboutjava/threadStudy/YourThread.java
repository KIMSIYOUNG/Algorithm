package aboutjava.threadStudy;

/**
 * Runnable Interface 구현을 통한 쓰레드 생성
 * Java는 다중상속을 지원하지 않는다. 따라서 Runnable 인터페이스를 구현함으로서
 * 타 클래스를 상속받는 클래스도 쓰레드를 생성하고 사용할 수 있도록 지원한다.
 */
public class YourThread implements Runnable{
    String str;

    public YourThread(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(str);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
