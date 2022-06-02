package pract;
import java.util.Stack;
public class GameResult extends GameUnit{
    int[] count = new int[members.length];
    int imax = -1;
    Stack<String> stack = new Stack<>();
    void resultShow(int idx,int cnt){
        System.out.print(members[idx] + " : ");
        for(int i=0;i<cnt;i++){
            System.out.print('-');
        }
        System.out.print("\n");
    }
    void winner(){
        for (int i = 0; i<count.length;i++){
            imax = Math.max(count[i],imax);
        }
        search();
        System.out.print("Winner : ");
        while(!stack.empty()){
            String mem = stack.peek();
            stack.pop();
            System.out.print(mem + ' ');
        }
    }
    void search(){
        for(int i =0;i<count.length;i++){
            if(count[i] == imax) stack.push(members[i]);
        }
    }
}
