package Mammal;
public class Gorilla extends Mammal {

public Gorilla(int energy) {
	super(energy);
	
	}
public void throwSomething() {
	energy-=5;
	System.out.println(" that the gorilla has thrown somthing "+energy);
}
public void eatBananas() {
	energy+=10;
	System.out.println("the Gorilla is satisfied "+energy);
	
}
public void climb() {
	energy-=10;
	System.out.println("the Gorilla is not satisfied "+energy);
	
	}
}
