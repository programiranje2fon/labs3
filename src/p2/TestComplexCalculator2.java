package p2;

public class TestComplexCalculator2 {

	public static void main(String[] args) {

		int factorial;
		factorial = ComplexCalculator2.factorial(5);
		System.out.println("Factorial 5 is: "+factorial);
		
		int abn = ComplexCalculator2.ABN(2, 3, 2);
		System.out.println("(2+3)^2="+abn);
	}

}
