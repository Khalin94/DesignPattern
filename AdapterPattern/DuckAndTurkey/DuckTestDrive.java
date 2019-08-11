public class DuckTestDrive{
	public static void main(String[] args){
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);



		System.out.println("Turkey-----");

		turkey.gobble();
		turkey.fly();

		testDuck(duck);

		System.out.println("turkey Adapter=====");
		testDuck(turkeyAdapter);

		System.out.println();

		testTurkey(turkey);

		System.out.println("duck Adapter========");
		testTurkey(duckAdapter);



	}

	private static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

	private static void testTurkey(Turkey turkey){
		turkey.gobble();
		turkey.fly();
	}
}
