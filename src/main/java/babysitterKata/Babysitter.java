package babysitterKata;

public class Babysitter {
	
	public static final String START_TIME_NOT_AVAILABLE_MESSAGE = "I'm sorry, I cannot start before 5 PM.";

	private int startTime;
	private int endTime;
	private String family;

	public Babysitter(int startTime) {
		this.startTime = startTime;
	}

	public Babysitter(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Babysitter(int startTime, int endTime, String family) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.family = family;
	}

	public Object getStartTime() {
		return startTime;
	}

	public Object getEndTime() {
		return endTime;
	}

	public Object getFamily() {
		return family;
	}

}
