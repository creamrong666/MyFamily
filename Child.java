package MyFamily;

public class Child extends Person {
	private static int brotherCount = 0;
	public static void howManyBrother() {
		System.out.println("私の兄弟は何人いますか？" + brotherCount + "人です。");
	}
	
	public Child(String name) {
		super(name);
		if (!"私".equals(name)) {
			brotherCount++;
		}
	}
}
