public class RockMusic extends MusicStyles {
    public RockMusic(String artist, String songName, String duration) {
        super(artist, songName, duration);
    }

    public String playMusic() {
        return "RockMusic{" +
                "artist='" + artist + '\'' +
                ", songName='" + songName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
