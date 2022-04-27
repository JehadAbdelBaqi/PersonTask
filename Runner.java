package personClassTask;

public class Runner {

	public static void main(String[] args) {
		Person jehad = new Person("Jehad", 33, 6, 9, "Software Engineer");
		Person alex = new Person("Alex", 25, 6, 8.5, "DevOps Engineer");
		Person matthew = new Person("Matthew", 24, 5.11, 7, "Cyber security analyst");
		Person pawel = new Person("Pawel", 25, 5.11, 8.5, "Traner");
	
		jehad.confirmHeightAndJob();
		pawel.confirmHeightAndJob();
		matthew.greetWithAge();
		alex.greetWithAge();
	
	}

}
