package Decorator;

public class ClassicPizza implements Pizza {
	private static final double CLASSIC_PIZZA = 40;

	@Override
	public String description() {
		return "Classic pizza: ";
	}

	@Override
	public double price() {
		return CLASSIC_PIZZA;
	}

}
