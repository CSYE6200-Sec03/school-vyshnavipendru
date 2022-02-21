package project;

public class Student extends Person implements Comparable<Student> {
	
	private double gpa ;


	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(int id, int age, String firstName, String lastName, double gpa) {
		super(id, age, firstName, lastName);
		this.gpa = gpa;
	}

	public String toString() {
		StringBuilder s= new StringBuilder();
		 s.append("Student :"+getFirstName() +" "+ getLastName()).append(", age "+getAge()).append(", with Id: "+getId()).append(", is a student having GPA: "+getGpa());
		
		return s.toString();
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
