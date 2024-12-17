package dec17.courses;

public class Main {

	public static void main(String[] args) 
	{
		Course[] c = new Course[] {new Course(1, "Mathematics", 1000),new Course(2,"Science",1200),new Course(3, "English", 900)};
		Offer[] offers = new Offer[] {new Offer("Special discount: Get 20% off on all courses!"),new Offer("Limited time offer: Enroll in any two courses and get one course free!")};
		EducationInstitute nit = new EducationInstitute(c, offers);
		
		Student s1 = new Student("Virat", nit);
		Student s2 = new Student("Dhoni", nit);
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				s1.viewCoursesAndFees();
				s1.viewOffers();
				s1.enrollInCourse(1);
				System.out.println("\n=====================\n");
			}
		};
		
		Runnable r2 = new Runnable() {
					
					@Override
					public void run() {
						s2.viewCoursesAndFees();
						s2.viewOffers();
						s2.enrollInCourse(2);
						System.out.println("\n=====================\n");
					}
				};
				
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		try {
		t1.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
