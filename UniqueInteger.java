import java.util.*;
/**
*Given the array of IDs, which contains many duplicate integers and one unique integer, find the unique integer.
**/
public class UniqueInteger{

    public static int findUniqueInteger(int[] delIdConfirms){
        if(delIdConfirms == null || delIdConfirms.length ==0)return -1;
        Set<Integer> idSet = new HashSet<Integer>();
        
        for(int delId:delIdConfirms){
        	if(idSet.contains(delId))idSet.remove(delId);
            else
               idSet.add(delId);
        }
        if(idSet.size()==1)return idSet.iterator().next();
        return -1;
    }
    public static void main(String[] args) {
        // run your function through some test cases here
        // remember: debugging is half the battle!
        int[] testInput = {2,4,2,9,7,4,9};
        System.out.println(findUniqueInteger(testInput));
    }
}
