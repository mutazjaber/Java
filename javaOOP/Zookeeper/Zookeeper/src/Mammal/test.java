package Mammal;

public class test {

	public static void main(String[] args) {
		Gorilla gorilla=new Gorilla(100);
		Bat bat= new Bat(300);
		gorilla.throwSomething();
		gorilla.eatBananas();
		gorilla.climb();
		bat.attackTown();
		bat.fly();
		bat.eatHumans();
	}

}
