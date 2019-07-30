import java.util.ArrayList;

public abstract class Pizza{
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();

	void prepare(){
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding topping...");
		for(int i = 0 ; i < toppings.size(); i++){
			System.out.println("  " + toppings.get(i));
		}
	}

	void bake(){
		System.out.println("bake for 25min at 350");
	}

	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box(){
		System.out.println("Place pizza into official PizzaStore Box");
	}

	public String getName(){
		return name;
	}
}
