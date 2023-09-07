package oops.polymorphism;

public class AnonymousClass {
    public static void main(String[] args) {
        MusicService musicService1 = new MusicServiceImpl();
        MusicService musicService2 = new MusicService() {
            void playMusic() {
                System.out.println("playing drum...");
            }
        };

    }
}

