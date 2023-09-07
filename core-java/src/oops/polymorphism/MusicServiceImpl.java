package oops.polymorphism;

//Separate class
public class MusicServiceImpl extends MusicService{
    void playMusic(){
        System.out.println("playing drum...");
    }

    public static void main(String[] args) {
        class Child extends MusicService{}//local inner class

        MusicService musicService = new MusicServiceImpl();
        musicService.playMusic();
    }
}
