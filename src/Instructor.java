
public class Instructor extends Person {
	public double salary;
	public Instructor (String instName, int instYear, double instSalary) {
		super(instName, instYear);
		salary = instSalary;
	}
	public String instToString(){
		String yearString = Integer.toString(birth);
		String salaryString = Double.toString(salary);
		String build = name.concat(", ");
		build = build.concat(yearString);
		build = build.concat(", ");
		build = build.concat(salaryString);
		return build;
	}
}
