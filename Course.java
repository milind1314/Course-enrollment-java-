package dec17.courses;

public class Course {

	private int courseId;
	private String courseName;
	private double corseFee;
	
	public Course(int courseId, String courseName, double corseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.corseFee = corseFee;	
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCorseFee() {
		return corseFee;
	}

	@Override
	public String toString() {
		return "" + getCourseId() + ". " + getCourseName() + "- Fee: Rs. "
				+ getCorseFee() + "";
	}
	
	
	
	
}
