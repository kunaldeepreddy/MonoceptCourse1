package abstractFactory;

public class AccomodationFactory extends AccomodationGraduationFactory {
	 @Override
	    public Graduation getGraduation(String graduationType)
	    {
	        return null;
	    }
	 
	    @Override
	    public Accomodation getAccomodation(String accomodationType)
	    {
	        if(accomodationType.equalsIgnoreCase("paying guest"))
	        {
	            return new PayingGuest();
	        }
	        else if(accomodationType.equalsIgnoreCase("hostel"))
	        {
	            return new Hostel();
	        }
	        else
	        {
	            return null;
	        }   
	    }
}
