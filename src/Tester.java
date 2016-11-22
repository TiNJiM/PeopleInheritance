
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person testPerson = new Person("Guy", 1999);
		Student testStudent = new Student("Dude", 1997, "General Studies");
		Instructor testInstructor = new Instructor("Bro", 1980, 75000);
		System.out.println(testPerson.personToString());
		System.out.println(testStudent.studentToString());
		System.out.println(testInstructor.instToString());
	}

}
