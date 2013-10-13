
public class Student {

	private String courseOpted;

	public String getCourseOpted() {
		return courseOpted;
	}

	public void setCourseOpted(String courseOpted) {
		this.courseOpted = courseOpted;
	}
	
	public void display()
	{
		System.out.println("CourseOpted Value : "+courseOpted);
	}
}
