class Fibonacci{
	public static void main(String[] args){
		Fibonacci fibonacci = new Fibonacci();
		int r_result = fibonacci.recursiveFib(10);
		int i_result = fibonacci.iterativeFib(10);
		System.out.println("recursive: "+r_result+" iterative: "+i_result);
	}
	
	//slow fib - repetitive computations
	//need extra space improve performance - memorization
	private int recursiveFib(int n){
		if(n==0||n==1)return n;
		return recursiveFib(n-1)+recursiveFib(n-2);
	}	
	
	//faster iterative approach
	private int iterativeFib(int n){
		int fib = 0;
		int prev = 1;
		for(int i = 0; i < n; i++){
			fib += prev;
			prev = fib;
		}
		return fib;
	}
}
