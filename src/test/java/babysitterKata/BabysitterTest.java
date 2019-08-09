package babysitterKata;

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

}
