package codeRefactor;

public class Student {

	private String name; 
	private double GPA; 
	private int physics; 
	private int biology; 
	private int mathematics; 
	private int english; 
	private int socialStudies; 
	private int computerScience; 
	private double total; 

	private Student(String name,double GPA, int physics, int biology, int mathematics,
			int english, int socialStudies, int computerScience, double total) {
		this.name = name;
		this.GPA = GPA;
		this.physics = physics;
		this.biology = biology;
		this.mathematics = mathematics;
		this.english = english;
		this.socialStudies = socialStudies;
		this.computerScience = computerScience;
		this.total = total;
	}

	public static Student displayMarks(String name, double GPA, int physics,int biology) {
		return new Student(name,GPA, physics, biology, 0, 0, 0, 0, 0.0);
	}

	public double getGPA() {
		return GPA;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public int getPhysics() {
		return physics;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public int getSocialStudies() {
		return socialStudies;
	}
	
	public int getBiology() {
		return biology;
	}
	
	public int getMathematics() {
		return mathematics;
	}
	
	public int getComputerScience() {
		return computerScience;
	}
	
	public double getTotal() {
		return total;
	}
	
	public static void main(String args[]) {
		Student result = Student.displayMarks("jon",9.0, 76,84);
		System.out.println(" student name:" + result.getStudentName());
		System.out.println(" student GPA:" + result.getGPA());
		System.out.println(" physics marks:" + result.getPhysics());
		System.out.println(" biology marks:" + result.getBiology());
		System.out.println(" socialStudies marks:" + result.getSocialStudies());
	}
}
