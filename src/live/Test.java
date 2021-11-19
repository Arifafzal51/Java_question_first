package live;
import music.playble;
import music.string.veena;
import music.wind.Saxphone;


public class Test {
    public static void main(String[] args) {
        veena v  = new veena();
        v.play();

        Saxphone S = new Saxphone();
        S.play();

        playble ps = new  Saxphone();
        ps.play();
    }
}
