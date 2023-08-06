import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

 class Codechef {
    void processData(int targetWeight,int rodWeight,int[] weightList){
    int totalWeight = 0;
    totalWeight = rodWeight;
    if(totalWeight < targetWeight){
    for(int i =0;i< weightList.length - 1;i++){
        if(weightList[i] == weightList[i+1]){
            totalWeight = totalWeight + weightList[i] + weightList[i+1];
            i++;
        }
         if(totalWeight >= targetWeight){
             break;
         }
    }
    }
    String res = totalWeight < targetWeight ? "NO" : "YES";
    System.out.println(res);
    }
    public static void main(String[] arg) {
         Codechef chef = new Codechef();
         Scanner scan = new Scanner(System.in);
       int targetWeight, rodWeight; 
        scan.nextLine();
        while(scan.hasNextLine()){
             String[] set = scan.nextLine().split(" ");
             targetWeight = Integer.parseInt(set[1]);
             rodWeight = Integer.parseInt(set[2]);
             int[] weightList = Arrays.stream(scan.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
             Arrays.sort(weightList);
             chef.processData(targetWeight, rodWeight, weightList);
        }
        scan.close();
    }
}
