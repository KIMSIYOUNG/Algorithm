package aboutjava.threadStudy;

public class MusicBox {
    public synchronized static void playMusicA() throws InterruptedException {
        for(int i=0; i<10; i++){
            System.out.println("신나는 음악!!");
            Thread.sleep((int)(Math.random()*1000));
        }
    }

    public synchronized static void playMusicB() throws InterruptedException {
        for(int i=0; i<10; i++){
            System.out.println("클럽 음악!!");
            Thread.sleep((int)(Math.random()*1000));
        }
    }

    public void playMusicC() throws InterruptedException {
        for(int i=0; i<10; i++){
            synchronized (this){
                System.out.println("카페 음악!!");
            }
            Thread.sleep((int)(Math.random()*1000));
        }
    }
}
