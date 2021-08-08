package singleton;

public class Singleton {

  private static volatile Singleton instance = null;

  public String s;
  
  private Singleton() {
	  s = "String of Singleton class";
  }

  public static Singleton getInstance() {
      if (instance == null) {
          synchronized (Singleton.class) {
              if (instance == null) {
                  instance = new Singleton();
              }
          }
      }
      return instance;
  }
}
