package decorator;

public class ExynosProcessor extends SmartPhone {
    public ExynosProcessor(Phone phone) {
        super(phone);
    }

    public String build() {
        return super.build() + addProcessor();
    }

    private String addProcessor() {
        return " Exynos 790";
    }

}
