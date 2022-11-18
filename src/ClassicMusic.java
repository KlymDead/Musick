public class ClassicMusic extends MusicStyles{
    public ClassicMusic(String artist, String songName, String duration) {
        super(artist, songName, duration);
    }

    @Override
    public String playMusic() {
        return String.format("Classic artist %s play their classic-song \"%s\", %s duration.",
                this.artist, this.songName, this.duration);
    }
}
