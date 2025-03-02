package com.toppings;

import com.pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator {
	
	BasePizza pizza;
	int toppingCost=10;

	public ExtraCheese(BasePizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	public ExtraCheese(BasePizza pizza, int toppingCost) {
		super();
		this.pizza = pizza;
		this.toppingCost = toppingCost;
	}

	@Override
	public int cost() {
		return this.pizza.cost()+toppingCost;
	}

}
