package babysitterKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BabysitterTest {
	
	@Test
	public void babysitterShouldHaveStartTimeEndTimeAndAFamily() {
		Babysitter babysitter = new Babysitter("startTime","endTime","family");
		assertNotNull(babysitter.getStartTime()); 
		assertNotNull(babysitter.getEndTime()); 
		assertNotNull(babysitter.getFamily()); 
	}
	
	@Test
	public void babysitterStartTime17EndTime4AndFamilyAShouldBeReturnable() {
		Babysitter babysitter = new Babysitter("17","4","A");
		assertEquals("17", babysitter.getStartTime());
		assertEquals("4", babysitter.getEndTime());
		assertEquals("A", babysitter.getFamily());
		
	}

}
