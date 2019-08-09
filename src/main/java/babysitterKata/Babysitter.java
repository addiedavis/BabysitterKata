package babysitterKata;

public class Babysitter {

	private String startTime;
	private String endTime;
	private String family;

	public Babysitter(String startTime) {
		this.startTime = startTime;
	}

	public Babysitter(String startTime, String endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Babysitter(String startTime, String endTime, String family) {
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
