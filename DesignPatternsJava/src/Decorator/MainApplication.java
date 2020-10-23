package Decorator;

public class MainApplication {

	public static void main(String[] args) {
		
		Pizza classicPizza = new GreenOlives(new Mushrooms(new ClassicPizza()));
		Pizza miaPizza = new Mushrooms(new MiaPizza());
		Pizza shefPizza = new Mushrooms(new Pepperoni(new GreenOlives(new ShefPizza())));
		System.out.println(classicPizza.description() + " " + classicPizza.price());
		System.out.println(miaPizza.description() + " " + miaPizza.price());
		System.out.println(shefPizza.description() + " " + shefPizza.price());

	}
}
