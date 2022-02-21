package project;

class Person  {

	private int id;
	private int age;
	private String firstName;
	private String lastName;
	
	
	
	public Person(int id, int age, String firstName, String lastName) {
		//super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		StringBuilder s= new StringBuilder();
		 s.append("Person :"+firstName +" "+ lastName).append(", age "+age).append(", with Id: "+id);
		
		return s.toString();
	}
	
}
