package Decorator;

public class Mushrooms extends ToppingDecorator{

	private static final double MUSHROOMS_PRICE = 4;
	public Mushrooms(Pizza pizzaDecorator) {
		super(pizzaDecorator);
	}
	
	@Override
	public String description() {
		String mushDescription = "Mushrooms";
		return super.description() + "," +  mushDescription;
	}
	
	@Override
	public double price() {
		return super.price() + MUSHROOMS_PRICE;
	}

}
