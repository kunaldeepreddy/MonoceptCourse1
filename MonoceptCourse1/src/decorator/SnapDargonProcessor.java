package decorator;

public class SnapDargonProcessor extends SmartPhone {
    public SnapDargonProcessor(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + addProcessor();
    }

    private String addProcessor() {
        return "snapdragon 860";
    }
}
