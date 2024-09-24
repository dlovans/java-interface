package Player;

/**
 * Represents an audio player.
 * Implements Player.
 */
public class AudioPlayer implements Player {
    /**
     * Play a song.
     */
    public void play() {
        System.out.println("Playing song!");
    }

    /**
     * Pause a song.
     */
    public void pause() {
        System.out.println("Song paused!");
    }

    /**
     * Stop the audio player.
     */
    public void stop() {
        System.out.println("Audio player stopped!");
    }
}
