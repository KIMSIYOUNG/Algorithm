package aboutjava;

public class MultiThread {

    public static void main(String[] args) {
        ThreadEX threadEX = new ThreadEX();
        ThreadEX threadEX1 = new ThreadEX();
        Thread thread = new Thread(threadEX,"A");
        Thread thread1 = new Thread(threadEX1, "B");

        thread1.start();
        thread.start();

        Thread.currentThread().getName();

    }

    public static class ThreadEX implements Runnable{

        int TestNum =0;

        @Override
        public void run() {
            for(int i=0; i<10; i++){
                if(Thread.currentThread().getName().equals("A")){
                    System.out.println("==================");
                    TestNum++;
                }
                System.out.println("ThreadName=" + Thread.currentThread().getName()+"TestNum="+TestNum);

                try{
                    Thread.sleep(500);
                    System.out.println("hello world");
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }
    }
}
