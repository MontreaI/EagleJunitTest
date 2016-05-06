package experiment;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CloudIDTest {

	@Test
	public void test() throws IOException {
		VerifyDevice junit = new VerifyDevice();
		boolean result = junit.CloudID("00042f");
		assertTrue("", result);
	}

}
