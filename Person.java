package personClassTask;

public class Person {
	private String name;
	private int age;
	private double heightInFt;
	private double shoeSize;
	private String jobTitle;

	public Person(String name, int age, double height, double shoeSize, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.heightInFt = height;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
	}

	public Person(String name, double height) {
		super();
		this.name = name;
		this.heightInFt = height;
	}



	public void greetWithAge() {
		System.out.println("Hello I'm " + name + ". I am " + age + " years old. " + 
				"Just in case you're wonering... HERE IS MY SHOESIZE " + shoeSize + ".");
	}
	
	public void confirmHeightAndJob() {
		System.out.println("I am " + heightInFt + "ft tall. I currently work as a " + jobTitle + ".");
	}
}
