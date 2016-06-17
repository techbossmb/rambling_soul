import java.util.*;

public class SmallestDifference{
	public static void main(String[] args){
		SmallestDifference smallestDifference = new SmallestDifference();
		int difference = smallestDifference.findSmallestDiff(new int[]{1,3,15,11,2}, new int[]{23,127,235,19,8});
		System.out.println(difference);
	}

	private int findSmallestDiff(int[] a, int[] b){
		if(a==null || b == null) return -1;
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0;
		int j = 0;
		int diff = Integer.MAX_VALUE;
		while(i < a.length && j < b.length){
			int curDiff = Math.abs(a[i] - b[j]);
			if(curDiff == 0)return 0;
			if(curDiff < diff)diff = curDiff;
			
			if(a[i] < b[j])i++;
			else j++;	
		}
		return diff;
	}
}
