import java.io.*; 

class main { 
	
	static int modInverse(int a, int m) 
	{ 
		a = a % m; 
		for (int x = 1; x < m; x++) 
		if ((a * x) % m == 1) 
			return x; 
		return 1; 
	} 
	
	public static void main(String args[]) 
	{ 
		int a = 26, m = 11; 
		System.out.println(modInverse(a, m)); 
	} 
} 

