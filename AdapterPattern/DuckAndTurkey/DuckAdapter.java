public class DuckAdapter implements Turkey{

	Duck duck;

	public DuckAdapter(Duck duck){
		this.duck = duck;

	}

	public void gobble(){
		duck.quack();
	}

	public void fly(){
		for(int i=0; i<2; i++){
			duck.fly();
		}
	}
}

