package singleton;

public class SingletonClass {

	 public static void main(String[] args) {

		
	        Singleton instance1 = Singleton.getInstance();
	        Singleton instance2 = Singleton.getInstance();
	        instance1.s = (instance1.s).toUpperCase();
	        System.out.println(instance1.s);
	        System.out.println(instance2.s);
	        instance2.s = (instance1.s).toLowerCase();
	        System.out.println(instance1.s);
	        System.out.println(instance2.s);
	    }
}
