public class Main {
	public static void main(Stirng[] args) {
		System.out.println("Start.");
		for(int i = 0; i < 9; i++) {
			Triple triple = Triple.getInstance(i % 3);
			System.out.println(i + ":" + triple);
		}
		System.out.println("End.");
	}
}