package person;

public abstract class Person {
	String familyName;
	String FirstName;
	String birthPlace;
	String birthDate;
	int ssn;
	public Person(String firstName,String familyName, int age)
	{
		
	}
	public abstract String greetings();
	public int calculateAge();
	public String toString();
}
