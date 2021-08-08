package builder;

public class BuilderClass {

	  public static void main(String[] args) {

	        Laptop.Builder builder = new Laptop.Builder()
	                .graphicsCard("Nvidia 4GB")
	                .secondaryMemory("1 TB SSD")
	                .ram("16 GB")
	                .processor("intel i7");

	        Laptop lap = builder.build();
	        System.out.println(lap);
	  }
}
