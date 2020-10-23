package Decorator;

public class ShefPizza implements Pizza{
	private static final double SHEF_PRICE = 56;
	@Override
	public String description() {
		return "Shef Pizza: Tomato, Pineapple, bell pepper and black olives";
	}

	@Override
	public double price() {
		return SHEF_PRICE;
	}

}
