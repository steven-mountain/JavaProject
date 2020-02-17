package Person11_2;

public class Staff {
	protected String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + "Staff [title=" + title + "]";
	}
	
}
