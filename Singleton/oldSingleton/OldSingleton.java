public class OldSingleton{
	private static OldSingleton uniqueInstance;

	private OldSingleton(){
	}

	public static OldSingleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new OldSingleton();
		}
		return uniqueInstance;
	}
}

