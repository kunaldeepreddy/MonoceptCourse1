package abstractFactory;

public class GraduationFactory extends AccomodationGraduationFactory {
	@Override
	public Graduation getGraduation(String graduationType) {
		if (graduationType.equalsIgnoreCase("UG")) {
			return new UnderGraduation();
		} else if (graduationType.equalsIgnoreCase("PG")) {
			return new PostGraduation();
		} else {
			return null;
		}
	}

	@Override
	public Accomodation getAccomodation(String accomodationType) {
		return null;
	}
}
