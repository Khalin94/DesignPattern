public class NoLazyInstance{
	private static NoLazyInstance uniqueInstance = new NoLazyInstance();

	private NoLazyInstance(){
	}

	public static NoLazyInstance getInstance(){
		return uniqueInstance;
	}
}
