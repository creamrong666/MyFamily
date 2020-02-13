package MyFamily;

public class Person {
	private static int personCount = 0;
	public static void howManyPeople() {
		System.out.println("私の家族に何人いますか？" + personCount + "人です。");
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
		personCount++;
	}
}
