package com.toppings;

import com.pizza.BasePizza;

public class ExtraMushroom extends ToppingsDecorator {
	BasePizza pizza;
	int toppingCost=5;

	public ExtraMushroom(BasePizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	public ExtraMushroom(BasePizza pizza, int toppingCost) {
		super();
		this.pizza = pizza;
		this.toppingCost = toppingCost;
	}

	@Override
	public int cost() {
		return this.pizza.cost()+toppingCost;
	}

}
