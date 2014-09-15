package idcard;
import framework.*;

public class IDCard extends Product {
	private String owner;
	private int serial;
	IDCard(String owner, int serial) {
		System.out.println("Establish " + owner + "'s card" + "(" + serial + ").");
		this.owner = owner;
		this.serial = serial;
	}
	public void use() {
		System.out.println("Use " + owner + "'s card" + "(" + this.serial + ").");
	}
	public String getOwner() {
		return owner;
	}
	public int getSerial() {
		return serial;
	}
}