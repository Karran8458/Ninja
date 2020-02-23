public class Wizard extends Human{
	int health = 50;
	int intelligence = 8;
	public void Wizard() {
    this.health = health;
	this.strength = strength;
	this.intelligence = intelligence;
	this.stealth = stealth;
    }
	public void heal(Human human1) {
	human1.health = human1.health + 200;
	}
	public void fireball(Human human1) {
	human1.health = human1.health - 100;
	}
}
