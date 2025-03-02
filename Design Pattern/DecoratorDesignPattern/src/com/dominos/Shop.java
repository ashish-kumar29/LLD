package com.dominos;

import com.pizza.BasePizza;
import com.pizza.FarmHousePizza;
import com.pizza.MargheritaPizza;
import com.pizza.VegDelightPizza;
import com.toppings.ExtraCheese;
import com.toppings.ExtraMushroom;
import com.toppings.ToppingsDecorator;

public class Shop {

	public static void main(String[] args) {
		BasePizza pizza1 = new FarmHousePizza();
		BasePizza pizza2 = new VegDelightPizza();
		BasePizza pizza3 = new MargheritaPizza();

		System.out.println("FarmHouse: "+pizza1.cost());
		System.out.println("VegDelight: "+pizza2.cost());
		System.out.println("Margherita: "+pizza3.cost());

		ToppingsDecorator extraCheese1 = new ExtraCheese(pizza1);
		ToppingsDecorator extraCheese2 = new ExtraCheese(pizza2);
		ToppingsDecorator extraCheese3 = new ExtraCheese(pizza3);

		System.out.println("FarmHouse with extra Cheese: "+extraCheese1.cost());
		System.out.println("VegDelight with extra Cheese: "+extraCheese2.cost());
		System.out.println("Margherita with extra Cheese: "+extraCheese3.cost());
		
		ToppingsDecorator extraMushroom1 = new ExtraMushroom(pizza1);
		ToppingsDecorator extraMushroom2 = new ExtraMushroom(pizza2);
		ToppingsDecorator extraMushroom3 = new ExtraMushroom(pizza3);

		System.out.println("FarmHouse with extra Mushroom: "+extraMushroom1.cost());
		System.out.println("VegDelight with extra Mushroom: "+extraMushroom2.cost());
		System.out.println("Margherita with extra Mushroom: "+extraMushroom3.cost());
		

		ToppingsDecorator extraMushroomAndCheese1 = new ExtraCheese(extraMushroom1);
		System.out.println("FarmHouse with extra Mushroom and Cheese: "+extraMushroomAndCheese1.cost());

	}

}
