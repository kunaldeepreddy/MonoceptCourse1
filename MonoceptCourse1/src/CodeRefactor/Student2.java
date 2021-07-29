package CodeRefactor;

public class Student2 {

	private String name = "";
	private String college = "";
	private double GPA = 0.0;
	private int maths = 0;
	private int science = 0;
	private int english = 0;
	private double physics = 0;
	private double total = 0.0;

	public String getStudentName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public int getMaths() {
		return maths;
	}

	public int getScience() {
		return science;
	}
	
	public int getEnglish() {
		return english;
	}

	public double getPhysics() {
		return physics;
	}

	public double getGPA() {
		return GPA;
	}
	
	public double getTotal() {
		return total;
	}

	public Student2(String name, String college, double GPA, int maths,
			int science, double physics,double total) {
		this.name = name;
		this.college = college;
		this.GPA = GPA;
		this.maths = maths;
		this.science = science;
		this.physics = physics;
		this.total = total;
	}

	public Student2(String name, String college, double GPA, 
			int maths, int science) {

		this(name, college, GPA, maths, science, 0, 0.0);
	}

	public Student2(String name, String college, double GPA,
			int maths, double physics) {

		this(name, college, GPA, maths, 0, physics, 0.0);
	}
	
	public Student2(String name, String college, double GPA,
			int maths, double physics, double total) {

		this(name, college, GPA, maths, 0, physics, total);
	}

	public static void main(String[] args) {

		Student2 snow = new Student2("snow", "jntu", 8.5, 90, 87.9, 267.7);

		System.out.println("student name: "+snow.getStudentName());
		System.out.println("college name: "+snow.getCollege());
		System.out.println("GPA: "+snow.getGPA());
		System.out.println("maths: "+snow.getMaths());
		System.out.println("science: "+snow.getScience());
		System.out.println("physics: "+snow.getPhysics());
		System.out.println("total: "+snow.getTotal());
	}
}
