package p1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import p1.ComplexCalculator;

public class ComplexCalculatorTest {

	private ComplexCalculator instance;

	@Before
	public void setUp() throws Exception {
		instance = new ComplexCalculator();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void method_divideDoubleDouble() {
		assertEquals("When divided 6.4 with 2.0, the result is not 3.2", 3.2, instance.divide(6.4, 2.0), 0.001);
	}

	@Test
	public void method_divideIntInt() {
		assertEquals("When divided 5 with 2, the result is not 2", 2, instance.divide(5, 2));
	}

	@Test
	public void method_divideMod() {
		assertEquals("When divided 8 with 3, the division remainder is not 2", 2, instance.divideMod(8, 3));
	}

	@Test(timeout = 2000)
	public void method_print50Times() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.print50Times(12);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "";

			for (int i = 1; i <= 50; i++)
				s = s + "12" + System.lineSeparator();

			assertEquals("If the 12 is passed, it is NOT printed 50 times to the output", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}

	}

	@Test(timeout = 2000)
	public void method_printUpTo100() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.printUpTo100();

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "";

			for (int i = 1; i <= 100; i++)
				s = s + i + System.lineSeparator();

			assertEquals("Numbers from 1 to 100 are not printed to the output", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test(timeout = 2000)
	public void method_sum() {
		assertEquals("For the argument 12, the method does not return the sum of 78", 78, ComplexCalculator.sum(12));
	}

	@Test(timeout = 2000)
	public void method_powerX() {
		assertEquals("For the arguments X = 3.0 and N = 4, the method does not return 81", 81.0, ComplexCalculator.powerX(3.0, 4),
				0.001);
	}

	@Test(timeout = 2000)
	public void method_minPower2() {
		assertEquals("For the argument 55, the method does not return 64", 64, ComplexCalculator.minPower2(55));

	}

	@Test(timeout = 2000)
	public void method_divideBy2() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			ComplexCalculator.divideBy2(33);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "16" + System.lineSeparator() + "8" + System.lineSeparator() + "4" + System.lineSeparator() + "2"
					+ System.lineSeparator() + "1";

			assertEquals("For the argument 33, the method does not print to the output the following: 16 8 4 2 1", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

}
