package p2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import p2.ComplexCalculator;

public class ComplexCalculator2Test {

	ComplexCalculator instance;

	@Before
	public void setUp() throws Exception {
		instance = new ComplexCalculator();
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

			instance.ispisi55Do0();

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "";

			for (int i = 55; i >= 0; i--)
				s = s + i + System.lineSeparator();

			assertEquals("NE ispisuju se brojevi od 55 do 0", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test(timeout = 2000)
	public void method_factorial() {
		assertEquals("Za unet broj N = 6 metoda ne vraca 720", 720, ComplexCalculator.faktorijel(6));
	}

	@Test(timeout = 2000)
	public void method_ABN() {
		assertEquals("Za unete brojeve A = 2, B = 4 i N = 3 metoda ne vraca 216", 216.0,
				ComplexCalculator.ABN(2, 4, 3), 0.001);
	}

}
