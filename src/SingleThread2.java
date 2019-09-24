public class SingleThread2 implements Runnable{

    private int[] temp;

    public SingleThread2(){
        temp = new int[10];
        for(int start = 0; start<temp.length; start++){
            temp[start] = start;
        }

    }

    @Override
    public void run() {
        for(int start:temp){
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(start);
        }
    }

    public static void main(String[] args) {
        SingleThread2 singleThread2 = new SingleThread2();
        Thread t = new Thread(singleThread2,"첫번째");
        t.start();
        t.run();
    }
}
