public class Volatile{
	private volatile static Volatile uniqueInstance;

	private Volatile(){
	}

	public static Volatile getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Volatile();
		}
		return uniqueInstance;
	}
}
