package composite;

public abstract class Person {
    protected String name;
    protected Integer personId;
    protected Long salary;

    public Person(String name, Integer personId, Long salary) {
        this.name = name;
        this.personId = personId;
        this.salary = salary;
    }

    public void add(Person person) {
        throw new UnsupportedOperationException("Cannot add reportee by default");
    }

    public void remove(Person person) {
        throw new UnsupportedOperationException("Cannot add reportee by default");
    }

    public abstract String toString();

}
