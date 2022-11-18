public class ClassicMusic extends MusicStyles{
    public ClassicMusic(String artist, String songName, String duration) {
        super(artist, songName, duration);
    }

    public String playMusic() {
        return "ClaassicMusic{" +
                "artist='" + artist + '\'' +
                ", songName='" + songName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
