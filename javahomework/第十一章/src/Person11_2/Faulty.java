package Person11_2;

public class Faulty extends Employee{
	protected String workTime;
	protected String level;

	public Faulty(String workTime, String level) {
		super();
		this.workTime = workTime;
		this.level = level;
	}
	
	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return super.toString() + "Faulty [workTime=" + workTime + ", level=" + level + "]";
	}
	
	
}
