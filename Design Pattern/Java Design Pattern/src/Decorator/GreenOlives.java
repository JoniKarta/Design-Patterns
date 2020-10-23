package Decorator;

public class GreenOlives extends ToppingDecorator {
	private static final double OLIVES_PRICE = 4;

	public GreenOlives(Pizza pizzaDecorator) {
		super(pizzaDecorator);
	}

	@Override
	public String description() {
		String olivesDescription = "Olives";
		return super.description() + "," + olivesDescription;
	}

	@Override
	public double price() {
		return super.price() + OLIVES_PRICE;
	}
}
