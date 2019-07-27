public class StarBuzzCoffee{
	public static void main(String[] args){

		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage darkroast = new DarkRoast();
		darkroast = new Mocha(darkroast);
		darkroast = new Mocha(darkroast);
		darkroast = new Whip(darkroast);
		System.out.println(darkroast.getDescription() + " $" + darkroast.cost());

		Beverage houseBlend = new HouseBlend();
		houseBlend = new SoyMilk(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());


	}

}

abstract class Beverage{
	String description = "null";

	public String getDescription(){
		return description;
	}

	public abstract double cost();
}

abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}

class Espresso extends Beverage{

	public Espresso(){
		description = "espresso";
	}

	public double cost(){
		return 1.99;
	}
}

class HouseBlend extends Beverage{
	
	public HouseBlend(){
		description = "houseBlend";
	}

	public double cost(){
		return .89;
	}
}

class DarkRoast extends Beverage{

	public DarkRoast(){
		description = "dark Roast";
	}

	public double cost(){
		return .99;
	}
}

class DeCafein extends Beverage{

	public DeCafein(){
		description = "decafein";
	}

	public double cost(){
		return 1.05;
	}
}

class Mocha extends CondimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " Mocha";
	}

	public double cost(){
		return .20 + beverage.cost();
	}
}

class SteamMilk extends CondimentDecorator{
	Beverage beverage;

	public SteamMilk(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " SteamMilk";
	}

	public double cost(){
		return .10 + beverage.cost();
	}

}

class SoyMilk extends CondimentDecorator{
	Beverage beverage;

	public SoyMilk(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " SoyMilk";
	}

	public double cost(){
		return .15 + beverage.cost();
	}
}

class Whip extends CondimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + " Whip";
	}

	public double cost(){
		return .10 + beverage.cost();
	}
}
