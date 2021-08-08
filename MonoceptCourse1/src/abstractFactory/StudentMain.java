package abstractFactory;

public class StudentMain {

	public static void main(String[] args)
    {
		AccomodationGraduationFactory accomodation = FactoryCreator.getAccomodationGraduationFactory("accomodation");
 
        System.out.println(accomodation.getAccomodation("hostel").getAccomodationType());
 
        AccomodationGraduationFactory graduation = FactoryCreator.getAccomodationGraduationFactory("graduation");
        System.out.println(graduation.getGraduation("UG").getGraduationType());
 
    }
	
}
