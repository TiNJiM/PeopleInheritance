
public class Student extends Person {
	public String major;
	public Student (String stuName, int stuYear, String maj){
		super(stuName, stuYear);
		major = maj;
	}
	public String studentToString(){
		String yearString = Integer.toString(birth);
		String build = name.concat(", ");
		build = build.concat(yearString);
		build = build.concat(", ");
		build = build.concat(major);
		return build;
	}
}
