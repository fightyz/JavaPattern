public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	public Object construct() {
		builder.makeTitle("Greeting");
		builder.makeString("From morning to evening");
		builder.makeItems(new String[] {
			"Morning.",
			"Nooning.",
		});
		builder.makeString("It's evening.");
		builder.makeItems(new String[] {
			"Evening.",
			"Have a good dream.",
			"Bye.",
		});
		return builder.getResult();
	}
}