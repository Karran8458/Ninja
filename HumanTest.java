public class HumanTest {
	public static void main(String[] args) {
    Human human1 = new Human();
	Human human2 = new Human();
	human1.attackHuman(human2);
	Wizard wizard1 = new Wizard();
    Ninja ninja1 = new Ninja();
    Samurai samurai1 = new Samurai();
    wizard1.heal(human1);
    wizard1.fireball(human1);
    ninja1.steal(human1);
    ninja1.runAway();
    samurai1.deathBlow(human2);
    samurai1.meditate();
    }
}
