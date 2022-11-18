public class MusicStyles {
    public String artist;
    public String songName;
    public String duration;

    public MusicStyles(String artist, String songName, String duration) {
        this.artist = artist;
        this.songName = songName;
        this.duration = duration;
    }
    public String playMusic() {
        return "MusicStyles{" +
                "artist='" + artist + '\'' +
                ", songName='" + songName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
