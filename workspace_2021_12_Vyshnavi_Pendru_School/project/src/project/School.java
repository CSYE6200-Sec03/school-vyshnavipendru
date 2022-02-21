package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class School {

	List< Person> personRoster = new ArrayList<>();
	List< Student> studentRoster = new ArrayList<>();
	
	
	
//	List< Student> studentRoster = new ArrayList<>();
//	List< Student> anotherstudent= null;
//	List< Person> anotherperson= studentRoster;
//	if(anotherperson instanceof List< Student>) {
//		anotherstudent=(List< Student>) anotherperson;
//	}
	public void addStudent() {
		studentRoster.add(new Student(24, 14, "Ram Nath", "Kovind", 3.9));
		studentRoster.add(new Student(29, 15, "Pranab", "Mukherjee", 3.1));
		studentRoster.add(new Student(21, 14, "Pratibha", "Patil", 3.3));
		studentRoster.add(new Student(25, 13, "Abdul", "Kalam", 3.8));
		studentRoster.add(new Student(22, 16, "Venkataraman", "Ramaswamy", 4.0));
	}

	public void addPerson() {
		personRoster.add(new Student(17, 12, "Donald", "Trump",3.9));
		personRoster.add(new Student(19, 11, "John", "Adams",3.2));
		personRoster.add(new Student(12, 13, "Barack", "Obama",3.5));
		personRoster.add(new Student(15, 11, "Zachary ", "Taylor",3.1));
		personRoster.add(new Student(11, 14, "George", "Washington",3.7));
	}

	public void sortStudent() {
		// sorting according to Id
		System.out.println("----Sort according to Id in Student----");
		Collections.sort(studentRoster, (i, j) -> i.getId() > j.getId() ? 1 : -1);
		for (Student stu : studentRoster) {
			System.out.println(stu);
		}
		// sorting according to Age
		System.out.println("----Sort according to Age in Student----");
		Collections.sort(studentRoster, (i, j) -> i.getAge() > j.getAge() ? 1 : -1);
		for (Student stu : studentRoster) {
			System.out.println(stu);
		}
		// sorting according to lastName
		System.out.println("----Sort according to Lastname in Student----");
		Collections.sort(studentRoster, (i, j) -> (i.getLastName().compareToIgnoreCase(j.getLastName())));
		for (Student stu : studentRoster) {
			System.out.println(stu);
		}
		// sorting according to GPA
		System.out.println("----Sort according to GPA in Student----");
		Collections.sort(studentRoster, (i, j) -> i.getGpa() > j.getGpa() ? 1 : -1);
		for (Student stu : studentRoster) {
			System.out.println(stu);
		}
	}

	public void sortPerson() {
		// sorting according to Id
		System.out.println("----Sort according to Id in Person----");
		Collections.sort(personRoster, (i, j) -> i.getId() > j.getId() ? 1 : -1);
		for (Person per : personRoster) {
			System.out.println(per);
		}
		// sorting according to Age
		System.out.println("----Sort according to Age in Person----");
		Collections.sort(personRoster, (i, j) -> i.getAge() > j.getAge() ? 1 : -1);
		for (Person per : personRoster) {
			System.out.println(per);
		}
		// sorting according to lastName
		System.out.println("----Sort according to Lastname in Person----");
		Collections.sort(personRoster, (i, j) -> (i.getLastName().compareToIgnoreCase(j.getLastName())));
		for (Person per : personRoster) {
			System.out.println(per);
		}
		
		List<Student> convertedPerson= personRoster.stream().filter(obj -> obj instanceof Student).map(Student.class::cast).collect(Collectors.toList());
		// sorting according to GPA
		System.out.println("----Sort according to GPA in Person----");
		Collections.sort(convertedPerson, ( i,  j) ->  i.getGpa() > j.getGpa() ? 1 : -1);
		for (Person per : convertedPerson) {
			System.out.println(per);
		}
	}

	@Override
	public String toString() {
		return "\nSchool: \n\tStudentRoster\n\t\t" + studentRoster + "\n\tPersonRoster\n\t\t" + personRoster ;
	}

	public static void demo() {
		School s = new School();
		s.addPerson();
		s.sortPerson();
		s.addStudent();
		s.sortStudent();
		System.out.println(s);
	}
}
