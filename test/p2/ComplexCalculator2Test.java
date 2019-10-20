package p2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import p2.ComplexCalculator2;

public class ComplexCalculator2Test {

	private ComplexCalculator2 instance;

	@Before
	public void setUp() throws Exception {
		instance = new ComplexCalculator2();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test(timeout = 2000)
	public void method_print55To0() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.print55To0();

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "";

			for (int i = 55; i >= 0; i--)
				s = s + i + System.lineSeparator();

			assertEquals("Numbers from 55 to 0 are not printed to the output", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test(timeout = 2000)
	public void method_factorial() {
		assertEquals("For the argument 6, the method does not return 720", 720, ComplexCalculator2.factorial(6));
	}

	@Test(timeout = 2000)
	public void method_ABN() {
		assertEquals("For the arguments A = 2, B = 4 and N = 3, the method does not return 216", 216.0,
				ComplexCalculator2.ABN(2, 4, 3), 0.001);
	}

}
