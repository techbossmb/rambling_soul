public class TrailingZeros{
	/**
	* counts the number of trailing zeros in the factorial of a number
	*/
	public static void main(String[] args){
		TrailingZeros trailingZeros = new TrailingZeros();
		int numOfZeros = trailingZeros.countTrailingZeros(1004);
		System.out.println(numOfZeros);
	}
	
	private int countTrailingZeros(int num){
		int powr = 1;
		int five = 5;
		int divisor;
		int count = 0;

		while((divisor = (int)Math.pow(five, powr)) <= num){
			count += Math.floor(num/divisor);
			powr++;
		}
		return count;
	}
}
