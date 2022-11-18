public class RockMusic extends MusicStyles {
    public RockMusic(String artist, String songName, String duration) {
        super(artist, songName, duration);
    }

    @Override
    public String playMusic() {
        return String.format("Rock Gang %s play their rock-song \"%s\", %s duration.",
                this.artist, this.songName, this.duration);
    }
}
