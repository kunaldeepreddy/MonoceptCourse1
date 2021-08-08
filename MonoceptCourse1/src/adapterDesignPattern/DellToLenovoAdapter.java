package adapterDesignPattern;

public class DellToLenovoAdapter implements Lenovo {

    Dell dellModel;

    public DellToLenovoAdapter(Dell dellModel) {
        this.dellModel = dellModel;
    }

    public void charge() {
    	dellModel.charge();
    }
}
