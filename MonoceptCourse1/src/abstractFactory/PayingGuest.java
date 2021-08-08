package abstractFactory;

public class PayingGuest implements Accomodation {
	@Override
	public String getAccomodationType() {
		return "paying guest";
	}
}
