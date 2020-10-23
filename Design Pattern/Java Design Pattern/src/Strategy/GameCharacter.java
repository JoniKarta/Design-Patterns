package Strategy;

import Strategy.weapon.WeaponBehavior;

/*
 * This class is equivalent to Context class in the strategy design pattern
 */
public abstract class GameCharacter {
	private WeaponBehavior weaponBehavior;

	public GameCharacter(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	public String fight() {
		return weaponBehavior.useWeapon();
	}
	
}
