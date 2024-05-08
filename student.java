package task4;

public class student {
	public int rollno;
	public String name;
	public int age;
	public String course;
	public student (int rollno,  String name,  int age, String course) throws AgeNotWithinRangeException ,NameNotValidException {
		if (age < 18 || age>21) {
			throw new AgeNotWithinRangeException("Age should be between 18 and 21");
		}
		if (!name.matches("[a-z || A-Z]+" ) ) {
			throw new NameNotValidException("Name should contain only alphabets and spaces");
			
		}
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
		public int getrollno() {
			return(rollno);
		}
		public String getname() {
			return(name);
		}
		public int getage() {
			return(age);
		}
		public String getcourse() {
			return(course);
		}
}
