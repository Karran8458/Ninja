public class Human {
	int health = 100;
	int strength = 3;
	int intelligence = 3;
	int stealth = 3;
	public void Human() {
    this.health = health;
	this.strength = strength;
	this.intelligence = intelligence;
	this.stealth = stealth;
    }
	public void attackHuman(Human human1) {
	human1.health = human1.health - 3;
	}
}
