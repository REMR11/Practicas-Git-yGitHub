package Students;

public class student {

	public student() {
		// TODO Auto-generated constructor stub
	}

	private int student_Id;
	private String fName;
	private String lName;
	private boolean status_Student;

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public boolean isStatus_Student() {
		return status_Student;
	}

	public void setStatus_Student(boolean status_Student) {
		this.status_Student = status_Student;
	}

	public String  To_String() {
		String 	s1 = 	"\nStudent ID:		" + getStudent_Id()
				+"\nStudent Name:   	" + getfName() + " " + getlName()
				+"\nStudent Status: 	" + isStatus_Student();
		return s1;
	}
}
