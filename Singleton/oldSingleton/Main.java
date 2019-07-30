public class Main{
	public static void main(String[] args){
//		OldSingleton s = new OldSingleton(); can't access clss
		
		OldSingleton s = OldSingleton.getInstance();

		System.out.println(s);
	}
}
