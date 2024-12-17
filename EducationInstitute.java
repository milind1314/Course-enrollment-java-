package dec17.courses;

public class EducationInstitute {

	private Course[] courses;
	private Offer[] offers;

	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}

	public Course[] getCourses() {
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}

	public void enrollStudentInCourse(int courseId, String studentName) 
	{
		for(Course c:courses)	
		{
			if(courseId==c.getCourseId())
			{
				System.out.println("\n"+studentName+" succesfully enrolled in "+c.getCourseName());
				break;
			}
		}
	}
}