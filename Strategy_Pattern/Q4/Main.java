public class Main {
	public static void main(String[] args) {
		String[] data = {
			"Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
		};
		SorterAndPoint sap = new SorterAndPoint(data, new QuickSorter());
		sap.execute();
	}
}