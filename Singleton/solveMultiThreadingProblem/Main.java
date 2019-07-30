public class Main{
	public static void main(String[] args){
		UsingSyncronized singleton1 = UsingSyncronized.getInstance();

		System.out.println(singleton1);

		NoLazyInstance singleton2 = NoLazyInstance.getInstance();
		System.out.println(singleton2);

		Volatile singleton3 = Volatile.getInstance();
		System.out.println(singleton3);
	}
}
	
