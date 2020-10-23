package Decorator;

public class Pepperoni extends ToppingDecorator{
	private static final double PEPPERONI_PRICE = 8;

	public Pepperoni(Pizza pizzaDecorator) {
		super(pizzaDecorator);
	}

	@Override
	public String description() {
		String olivesDescription = "Pepperoni";
		return super.description() + "," + olivesDescription;
	}

	@Override
	public double price() {
		return super.price() + PEPPERONI_PRICE ;
	}
}
