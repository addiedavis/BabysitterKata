package babysitterKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BabysitterTest {
	
	@Test
	public void babysitterObjectExistsWithJustStartTime() {
		Babysitter babysitter = new Babysitter("startTime");	
		assertNotNull(babysitter.getStartTime()); 
	}
	
	@Test
	public void babysitterObjectExistsWithJustStartTimeAndEndTime() {
		Babysitter babysitter = new Babysitter("startTime","endTime");	
		assertNotNull(babysitter.getStartTime()); 
		assertNotNull(babysitter.getEndTime());
	}
	
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
	
	@Test
	public void babysitterStartTime19EndTime3AndFamilyBShouldBeReturnable() {
		Babysitter babysitter = new Babysitter("19","3","B");
		assertEquals("19", babysitter.getStartTime());
		assertEquals("3", babysitter.getEndTime());
		assertEquals("B", babysitter.getFamily());
	}


}
