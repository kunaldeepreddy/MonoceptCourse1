package composite;

public class Supporter extends Person {
    public Supporter(String name, Integer personId, Long salary) {
        super(name, personId, salary);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Supporter: ");
        builder.append(name);
        builder.append(",");
        builder.append(personId);
        builder.append("...\n");

        return builder.toString();
    }
}
