package composite;

import java.util.ArrayList;
import java.util.List;

public class President extends Person {

    private List<Person> people = new ArrayList<>();

    public President(String name, Integer personId, Long salary) {
        super(name, personId, salary);
    }

    @Override
    public void add(Person person){
        people.add(person);
    }

    @Override
    public void remove(Person person){
        people.remove(person);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("Manager: ");
        builder.append(name);
        builder.append(",");
        builder.append(personId);
        builder.append("...\n ");


        builder.append("people:");

        people
                .forEach(person -> builder.append(person.toString()));


        return builder.toString();
    }
}
