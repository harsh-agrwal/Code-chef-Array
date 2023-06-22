class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int cO5 = 0; 
        int cO10 = 0;
        for(int i=0;i<N;i++){
            if(bills[i] != 5){
                if(bills[i] == 10){
                    cO10++;
                    if(cO5 == 0)
                    return false;
                    else{
                        cO5--;
                    }
                }
                else{  
                    if((cO10>=1 && cO5>=1)){
                        cO10--;
                        cO5--;
                    }
                    else if(cO5>=3){
                        cO5 -= 3;
                    }
                    else return false;
                }
            }
            else{
                cO5++;
            }
        }
        return true;
    }
}
