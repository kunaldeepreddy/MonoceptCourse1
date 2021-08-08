package abstractFactory;

public class FactoryCreator {

	 public static AccomodationGraduationFactory  getAccomodationGraduationFactory(String type)
	    {
	        if(type.equalsIgnoreCase("accomodation"))
	        {
	            return new AccomodationFactory();
	        }
	        else if(type.equalsIgnoreCase("graduation"))
	        {
	            return new GraduationFactory();
	        }
	        else
	        {
	            return null;
	        }   
	    }
}
