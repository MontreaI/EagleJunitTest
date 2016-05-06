package experiment;

import static org.junit.Assert.*;

import org.junit.Test;

public class MACTest {

	@Test
	public void test() {
		VerifyDevice junit = new VerifyDevice();
		boolean result = junit.MAC("0000 0000 0000 0000");
		assertTrue("", result);
	}

}
