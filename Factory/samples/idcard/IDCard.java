package idcard;
import framework.*;

public class IDCard extends Product {
	private String owner;
	IDCard(String owner) {
		System.out.println("Establish " + owner + "'s card.");
		this.owner = owner;
	}
	@Override
	public void use() {
		System.out.println("Use " + owner + "'s card.");
	}
	public String getOwner() {
		return owner;
	}
}