// 1,1,2,3,5,8,13...	
public static int fibonacci_Sequence(int n) {//n代表斐波那契数列的第n项
		int num = 0;//return value
		if (n == 1) {
			return 1;
		}else if (n == 2) {
			return 1;
		}else {
			return fibonacci_Sequence( n - 1 ) + fibonacci_Sequence( n - 2 );
		}
	}
