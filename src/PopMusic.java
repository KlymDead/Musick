public class PopMusic extends MusicStyles {


    public PopMusic(String artist, String songName, String duration) {
        super(artist, songName, duration);
    }



    @Override
    public String playMusic() {
        return String.format("Pop artist %s play their pop-song \"%s\", %s duration.",
                this.artist, this.songName, this.duration);
    }
}
