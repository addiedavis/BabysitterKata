package babysitterKata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PayRateTest {
	
	@Test
	public void familyAPays15AnHourFrom17To22() {
		PayRate payrate = new PayRate("A");
		assertEquals(15, payrate.getPayRate());
	}

}
