public class MiniDuckSimulator{
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("=======================");	

		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();

	}
}

abstract class Duck{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior = qb;
	}

	public Duck(){
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public abstract void display();

	public void swim(){
		System.out.println("swim all Ducks");
	}
}

class ModelDuck extends Duck{
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display(){
		System.out.println("Model Duck!");
	}	
}

class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display(){
		System.out.println("water Duck!");
	}
}
	
		

interface FlyBehavior{
	public void fly();
}

class FlyWithWings implements FlyBehavior{
	public void fly(){
		System.out.println("====== flying ======");
	}
}
class FlyNoWay implements FlyBehavior{
	public void fly(){
		System.out.println("======= Can't Fly ========");
	}
}

class FlyRocketPowered implements FlyBehavior{
	public void fly(){
		System.out.println("====== Flying using Rocket Power!=======");
	}
}

interface QuackBehavior{
	public void quack();
}

class Quack implements QuackBehavior{
	public void quack(){
		System.out.println("======Quack========");
	}
}

class MuteQuack implements QuackBehavior{
	public void quack(){
		System.out.println("======= Mute! Can't Qacuk=======");
	}
}

class Bbick implements QuackBehavior{
	public void quack(){
		System.out.println("======== bbick bbick!! =========");
	}
}
 
