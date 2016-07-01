import java.util.*;
/** Coded on Google Nexus 5 at a live music concert 
* Given a number, find the least number if squares combinations that  add up to that number 
* @author: Ishola Babatunde 
*/
public class Program
{
    public static void main(String[] args) {
        int sum = findLeastSumSquare(10);
        System.out.println(sum);
    }
    
    public static int findLeastSumSquare(int value){
    ArrayList<Integer> squares = new ArrayList<>();
    int maxSquare = 0;
    int count = 0;
    while(maxSquare < value){
       count++;
       maxSquare = count*count;
       if(maxSquare <= value){
          squares.add(maxSquare); 
       }
    }
    System.out.println(squares);
    
    int[] bestSum = new int[value+1];
    for(Integer square:squares){
       for(int i = 1; i<= value; i++){
           if(square > i)continue;
           if(i%square == 0){
              bestSum[i] = Math.min(bestSum[i-square]+1, bestSum[i-1]+1);
           }else{
              bestSum[i] = bestSum[i-1]+1;
           }
       } 
    }
    return bestSum[value];
    }
}
