package aboutjava.threadStudy;

public class MusicPlayer extends Thread{
    int type;
    MusicBox musicBox;

    public MusicPlayer(int type, MusicBox musicBox) {
        this.type = type;
        this.musicBox = musicBox;
    }

    @Override
    public void run() {
        switch (type){
            case 1:
                try {
                    MusicBox.playMusicA();
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 2:
                try {
                    MusicBox.playMusicB();
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            case 3:
                try {
                    MusicBox musicBox = new MusicBox();
                    musicBox.playMusicC();
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
