import java.util.*;
import java.lang.*;

class Card{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int N = s.nextInt();
            HashMap<Integer,Integer> A = new HashMap<>();
            int curr=0,maxm=0;
            
            for(int i=0;i<N;i++){
                int id = s.nextInt();
                
                if(!(A.containsKey(id))){
                    curr++;
                    A.put(id,1);
                }else{
                    curr--;
                    A.remove(id);
                }
                
                maxm = maxm>curr?maxm:curr;
            }
            System.out.println(maxm);
        }
    }
}
