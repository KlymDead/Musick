public abstract class MusicStyles {
    protected String artist;
    protected String songName;
    protected String duration;

    protected MusicStyles(String artist, String songName, String duration) {
        this.artist = artist;
        this.songName = songName;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public abstract String playMusic();
}