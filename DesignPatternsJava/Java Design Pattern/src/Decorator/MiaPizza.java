package Decorator;

public class MiaPizza implements Pizza {
	private static final double MIA_PRICE = 49;
	@Override
	public String description() {
		return "Mia Pizza: Eggplant, bell pepper black and green olives ";
	}

	@Override
	public double price() {
		return MIA_PRICE;
	}

}
