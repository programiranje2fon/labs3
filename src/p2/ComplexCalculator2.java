package p2;

public class ComplexCalculator2 {

	void print55To0() {
		for (int i = 55; i >= 0; i--)
			System.out.println(i);
	}

	static int factorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++)
			f = f * i;
		return f;
	}

	static int ABN(int a, int b, int n) {
		int rezultat = 1;
		for (int i = 1; i <= n; i++)
			rezultat = rezultat * (a + b);
		return rezultat;
	}

}
