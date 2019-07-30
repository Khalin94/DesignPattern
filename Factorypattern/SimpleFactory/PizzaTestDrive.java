public class PizzaTestDrive{
	public static void main(String[] args){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore calStore = new CalPizzaStore();

		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("ny Style : " + pizza.getName());

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("chicago Style : "+ pizza.getName());

		pizza = calStore.orderPizza("cheese");
		System.out.println("Callifonia Style : " + pizza.getName());

	}
}
