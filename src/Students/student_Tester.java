package Students;

import Students.student;
import java.util.Scanner;

public class student_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		student st = new student();

		System.out.println("Proporciona Id de estudiante: ");
		st.setStudent_Id(Integer.parseInt(sc.nextLine()));

		System.out.println("Proporciona primer nombre de estudiante: ");
		st.setfName(sc.nextLine());

		System.out.println("Proporciona apellido nombre de estudiante: ");
		st.setlName(sc.nextLine());

		System.out.println("Proporciona el estado del alumno: activo(1), inactivo(0)");
		String status_Student = sc.nextLine();
		st.setStatus_Student(status_Student.equals("1"));

		System.out.println(st.To_String());
	}

}
