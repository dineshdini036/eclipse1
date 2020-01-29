package git;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {

		Prime p =new Prime();
		assertEquals(true,p.IsPrime(6));
	}

}
