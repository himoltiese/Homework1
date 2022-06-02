package pract;
import java.util.Scanner;
public class GameUnit {
    Scanner sc = new Scanner(System.in);
    String[] members;
    int tryNum;
    public GameUnit(){
        System.out.println("Write game members");
        members = sc.nextLine().split(",");
        System.out.println("how many times will you try?");
        tryNum = sc.nextInt();
    }
}
