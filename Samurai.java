public class Samurai extends Human{
	int health = 200;
	public void Samurai() {
    this.health = health;
	this.strength = strength;
	this.intelligence = intelligence;
	this.stealth = stealth;
    }
	public void deathBlow(Human human1) {
	human1.health = human1.health - 300;
	}
	public void meditate() {
	health = health + 100;
	}
	public int howMany() {
	return health;
	}
}
