package MyFamily;

public class Family {

	public static void main(String[] args) {
		
		new Child("私");
		new Parent("お父さん");
		new Parent("お母さん");
		new Child("お姉さん");
		new Child("弟");
		
		Person.howManyPeople();
		Child.howManyBrother();
	}

}
