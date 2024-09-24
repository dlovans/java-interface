package Player;

/**
 * Represents a video player.
 * Implements Player.
 */
public class VideoPlayer implements Player {
    /**
     * Plays video.
     */
    public void play() {
        System.out.println("Playing video!");
    }

    /**
     * Pauses video.
     */
    public void pause() {
        System.out.println("Video paused!");
    }

    /**
     * Stops video player.
     */
    public void stop() {
        System.out.println("Video player stopped!");
    }
}
