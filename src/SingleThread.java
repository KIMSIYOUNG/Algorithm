

public class SingleThread extends Thread{
    private int[] temp;

    public SingleThread(String threadname) {
        super(threadname);
        temp = new int[10];


        for (int start = 0; start<temp.length; start++){
            temp[start] = start;
        }
    }

    public void run(){
        for(int start:temp){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(currentThread().getName());
            System.out.println(start);
        }

    }

    public static void main(String[] args) {
        SingleThread st = new SingleThread("첫번째");
        st.start();
        st.run();
    }

}
