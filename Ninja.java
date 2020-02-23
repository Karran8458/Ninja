public class Ninja extends Human{
	int stealth = 10;
	public void Ninja() {
    this.health = health;
	this.strength = strength;
	this.intelligence = intelligence;
	this.stealth = stealth;
    }
	public void steal(Human human1) {
	human1.health = human1.health - 8;
	this.stealth = this.stealth + 8;
	}
	public void runAway() {
	health = health - 10;
	}
}
