public class UsingSyncronized{
	private static UsingSyncronized uniqueInstance;

	private UsingSyncronized(){
	}

	public static synchronized UsingSyncronized getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new UsingSyncronized();
		}
		return uniqueInstance;
	}
}

