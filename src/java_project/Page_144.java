package java_project;

public class Page_144 {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setStudnetName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Page_144 student = new Page_144();
		student.studentName = "Youngmin";
		System.out.println(student.studentName);

		student.setStudnetName("hanyoung");
		System.out.println(student.getstudentName());

	}

}
