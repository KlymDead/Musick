public class PopMusic extends MusicStyles {


    public PopMusic(String artist, String songName, String duration) {
        super(artist, songName, duration);

    }
    public String playMusic() {
        return "PopMusick{" +
                "artist='" + artist + '\'' +
                ", songName='" + songName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
