public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("Establish the instance of object.");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}