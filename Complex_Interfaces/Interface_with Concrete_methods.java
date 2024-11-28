interface ActionController {
    void start();
    void pause();
    void stop();

    default void forward() {
        System.out.println("skip forward by 10 sec");
    }

    default void backward() {
        System.out.println("skip backward by 10 sec");
    }
}

class MediaPlayer implements ActionController {

    @Override
    public void start() {
        System.out.println("Player started");
    }

    @Override
    public void pause() {
        System.out.println("Player paused");
    }

    @Override
    public void stop() {
        System.out.println("Player stopped");
    }
}
public class MainC {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.start();
        player.pause();
        player.forward();
        player.backward();
    }
}