package abstractFactory;

public abstract class AccomodationGraduationFactory {

	public abstract Accomodation getAccomodation(String accomodationType);

	public abstract Graduation getGraduation(String graduationType);

}
