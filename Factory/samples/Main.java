import framework.*;
import idcard.*;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("fightyz");
		Product card2 = factory.create("test");
		card1.use();
		card2.use();
	}
}