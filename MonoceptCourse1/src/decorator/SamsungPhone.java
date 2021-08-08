package decorator;

public class SamsungPhone extends SmartPhone {
    public SamsungPhone(Phone phone) {
        super(phone);
    }

    public String build() {
        return super.build() + addBranding();
    }

    private String addBranding() {
        return " Samsung Phone";
    }
}
