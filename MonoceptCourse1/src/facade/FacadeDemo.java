package facade;

public class FacadeDemo {

    public static void main(String[] args) {

        FacadePhone facadePhone = new FacadePhone();

        System.out.println(facadePhone.getAsusLaptop());
        System.out.println(facadePhone.getDellLaptop());
        System.out.println(facadePhone.getLenovoLaptop());

    }
}
