package facade;

public class FacadePhone {

    private Asus asus;
    private Dell dell;
    private Lenovo lenovo;

    public FacadePhone() {
        asus = new Asus();
        dell = new Dell();
        lenovo = new Lenovo();
    }

    public String getAsusLaptop() {
        return asus.build();
    }

    public String getDellLaptop() {
        return dell.build();
    }
    
    public String getLenovoLaptop() {
        return lenovo.build();
    }

}
