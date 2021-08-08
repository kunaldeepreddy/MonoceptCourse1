package adapterDesignPattern;

public class AdapterExample {

    public static void main(String[] args) {

        DellCharger dellCharger = new DellCharger();
        Dell dellModel = new DellInspiron();
        dellCharger.charge(dellModel);

        LenovoCharger lenovoCharger = new LenovoCharger();
        Lenovo lenovoModel = new LenovoZen();
        lenovoCharger.charge(lenovoModel);

        DellToLenovoAdapter adapter = new DellToLenovoAdapter(dellModel);
        lenovoCharger.charge(adapter);


    }
}
