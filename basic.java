// 1,1,2,3,5,8,13...	
	//f(0) = 1;f(1) = 1;...;f(n) = f(n-1)+f(n-2);
	//method first,time complexity is O(2^N)
	public static int fibonacci_Sequence(int n) {//n代表斐波那契数列的第n项
		if (n < 1) {
			return 0;
		}else if (n==1 || n == 2) {
			return 1;
		}else {
			return fibonacci_Sequence( n - 1 ) + fibonacci_Sequence( n - 2 );
		}
	}
	
	//method second,time complexity is O(N)
	public static int fibonacci_Sequence(int n) {//n代表斐波那契数列的第n项
		if (n < 1) {
			return 0;
		}
		if (n==1 || n == 2) {
			return 1;
		}
		int res = 1;
		int pre = 1;
		int temp = 0;
		for(int i = 3; i <= n; i++){
			tmp = res;
			res = res + pre;
			pre = tmp;
		}
		return res;
	}
