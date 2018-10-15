package p2;

public class ComplexCalculator2 {

	void ispisi55Do0() {
		// Brojeve treba ispisati u opadajucem
		// redosledu (55,54,53,...2,1,0) pa se
		// moze postaviti da brojac petlje ide
		// od vece vrednosti ka manjoj tj. da se
		// umanjuje za jedan u svakom koraku.
		for (int i = 55; i >= 0; i--)
			System.out.println(i);
	}

	static int faktorijel(int n) {
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
