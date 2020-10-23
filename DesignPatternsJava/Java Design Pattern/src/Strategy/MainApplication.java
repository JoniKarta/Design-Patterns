package Strategy;

import Strategy.weapon.AxeBehavior;
import Strategy.weapon.NoWeapon;
import Strategy.weapon.SwordBehavior;

public class MainApplication {

	public static void main(String[] args) {
		GameCharacter king = new King(new SwordBehavior());
		GameCharacter queen = new Queen(new NoWeapon());
		GameCharacter troll = new Troll(new AxeBehavior());
		System.out.println(king.fight());
		System.out.println(queen.fight());
		System.out.println(troll.fight());
	}
}
