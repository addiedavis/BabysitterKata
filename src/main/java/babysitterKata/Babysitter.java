package babysitterKata;

public class Babysitter {

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
