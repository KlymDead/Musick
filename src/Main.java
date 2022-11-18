import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MusicStyles song = new PopMusic("BoyWithUke","Sick of U", "2:49");
        MusicStyles song2 = new RockMusic("Suicide Silence","YOLO", "4:02");
        MusicStyles song3 = new ClassicMusic("Toms Mucenieks","Spring Waltz", "5:02");
        MusicStyles[] arr = {song,song2,song3};
        for(MusicStyles list : arr ){
           System.out.println(list.playMusic());
        }


    }
}