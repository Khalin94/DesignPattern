public class CalPizzaStore extends PizzaStore{
	Pizza createPizza(String type){
		if(type.equals("cheese")){
			return new CalStyleCheesePizza();
		}
//		else if(type.equals("veggie")){
//			return new CalStyleVeggiePizza();
//		}else if(type.equals("clam")){
//			return new CalStyleClamPizza();
//		}else if(type.equals("pepperoni")){
//			return new CalStylePepperoniPizza();
//		}
		else{
			return null;
		}
	}
}
