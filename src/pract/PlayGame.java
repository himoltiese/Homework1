package pract;
import java.util.Random;
public class PlayGame extends GameResult {
    Random random = new Random();

    public PlayGame(){
        for(int i=0;i<tryNum;i++){
            count[random.nextInt(members.length)]++;
            for(int j=0;j<members.length;j++){
                resultShow(j,count[j]);
            }
        }
        winner();
    }
}
