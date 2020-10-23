package Decorator;

public abstract class ToppingDecorator implements Pizza{

	private Pizza pizzaDecorator;
	
	public ToppingDecorator(Pizza pizzaDecorator) {
		this.pizzaDecorator = pizzaDecorator;
	}
	
	@Override
	public String description() {
		return pizzaDecorator.description();
	}
	
	@Override
	public double price() {
		return pizzaDecorator.price();
	}
}
