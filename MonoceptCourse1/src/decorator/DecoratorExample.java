package decorator;

public class DecoratorExample {

    public static void main(String[] args) {


        Phone androidPhone = new AndroidPhone(new BasicPhone());
        System.out.println(androidPhone.build());


        Phone applePhone = new ApplePhone(new BasicPhone());
        System.out.println(applePhone.build());


        Phone samsungSnapDragonPhone = new SamsungPhone(new SnapDargonProcessor(new BasicPhone()));
        System.out.println(samsungSnapDragonPhone.build());

        Phone samsungExynosPhone = new SamsungPhone(new ExynosProcessor(new BasicPhone()));
        System.out.println(samsungExynosPhone.build());

    }
}
