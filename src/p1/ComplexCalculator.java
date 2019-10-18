package p1;

class ComplexCalculator {

	double divide(double a, double b) {
		return a / b;
	}

	int divide(int a, int b) {
		return a / b;
	}

	int divideMod(int a, int b) {
		return a % b;
	}

	void print50Times(int x) {
		for (int i = 1; i <= 50; i++)
			System.out.println(x);
	}

	void printUpTo100() {
		for (int i = 1; i <= 100; i++)
			System.out.println(i);
	}

	static int sum(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum = sum + i;

		return sum;
	}

	static double powerX(double x, int n) {
		double p = 1;

		for (int i = 1; i <= n; i++)
			p = p * x;

		return p;
	}

	static int minPower2(int n) {
		int result = 1;

		while (result < n)
			result = result * 2;

		return result;
	}

	static void divideBy2(int n) {

		while (n > 1) {
			n = n / 2;
			System.out.println(n);
		}

	}

}
