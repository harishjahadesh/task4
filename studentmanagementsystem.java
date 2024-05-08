package task4;

public class studentmanagementsystem {
	public static void main(String[] args) {
	try {
	student student1 = new student(1 , "Max", 20, "Mechanical Enginer");
	System.out.println("student1 created sucessfully:");
	System.out.println("rollno :"+student1.getrollno());
	System.out.println("name :"+student1.getname());
	System.out.println("age :"+student1.getage());
	System.out.println("course :"+student1.getcourse());
	student student2 = new student(2 , "sam", 23, "computer science");
	System.out.println("student2 created sucessfully:");
	System.out.println("rollno :"+student2.getrollno());
	System.out.println("name :"+student2.getname());
	System.out.println("age :"+student2.getage());
	System.out.println("course :"+student2.getcourse());
	}catch(AgeNotWithinRangeException e){
	System.out.println("Error creating student : "+ e.getMessage());	
	}catch (NameNotValidException e) {
	System.out.println("Error creating student : "+ e.getMessage());		
	}
	}
}
