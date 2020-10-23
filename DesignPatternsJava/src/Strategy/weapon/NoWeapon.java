package Strategy.weapon;

public class NoWeapon implements WeaponBehavior {

	@Override
	public String useWeapon() {
		return "No Weapon In Arsenal";
	}
}
