package p2;

public class TestComplexCalculator2 {

	public static void main(String[] args) {

		int faktorijel;
		faktorijel = ComplexCalculator2.faktorijel(5);
		System.out.println("Faktorijel 5 je: "+faktorijel);
		
		int abn = ComplexCalculator2.ABN(2, 3, 2);
		System.out.println("(2+3)^2="+abn);
	}

}
