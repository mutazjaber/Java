package Barista;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Order order1 = new Order("mutaz",true , new ArrayList());
//		Order order2 = new Order();
		
//		order1.setName("Mutaz");
//		order1.setName("Mutaz");
//		order1.setReady(true);
//		order1.setName("cundahuri");
//		order1.setReady(false);
		
		
		
		
		Item item1 =new Item(" Cofeelateh " ,  20.33);
		Item item2 =new Item(" Cofeedark " , 10.32);
//		Item tem3 =new Item(" Cofee2eh " , 2.22);
//		Item item4 =new Item(" Cofeelw " , 3.33);
//		Item item5 =new Item(" Cofeeqh " , 7.77);
		
		order1.addItem(item1);
		order1.addItem(item2);
//		order2.addItem(item1);
//		order2.addItem(item2);
		
		
		
		System.out.println(order1.toString());
		System.out.println(order1.tooString());
		
		
	}

}	
