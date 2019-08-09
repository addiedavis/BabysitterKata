package babysitterKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BabysitterTest {

	Babysitter babysitter1 = new Babysitter(17, 4, "A");
	Babysitter babysitter2 = new Babysitter(19, 3, "B");

	@Test
	public void babysitterObjectExistsWithJustStartTime() {
		Babysitter babysitter = new Babysitter(17);
		assertNotNull(babysitter.getStartTime());
	}

	@Test
	public void babysitterObjectExistsWithJustStartTimeAndEndTime() {
		Babysitter babysitter = new Babysitter(17, 4);
		assertNotNull(babysitter.getStartTime());
		assertNotNull(babysitter.getEndTime());
	}

	@Test
	public void babysitterShouldHaveStartTimeEndTimeAndAFamily() {
		assertNotNull(babysitter1.getStartTime());
		assertNotNull(babysitter1.getEndTime());
		assertNotNull(babysitter1.getFamily());
	}

	@Test
	public void babysitterStartTime17EndTime4AndFamilyAShouldBeReturnable() {
		assertEquals(17, babysitter1.getStartTime());
		assertEquals(4, babysitter1.getEndTime());
		assertEquals("A", babysitter1.getFamily());
	}

	@Test
	public void babysitterStartTime19EndTime3AndFamilyBShouldBeReturnable() {
		assertEquals(19, babysitter2.getStartTime());
		assertEquals(3, babysitter2.getEndTime());
		assertEquals("B", babysitter2.getFamily());
	}
	
	


}
