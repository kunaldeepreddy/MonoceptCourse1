package composite;

public class CompositeExample {

    public static void main(String[] args) {

        Person person1 = new Supporter("Ram", 1, 100L);
        Person person2 = new Supporter("Sam", 2, 200L);
        Person person3 = new Supporter("Syam", 3, 300L);
        Person person4 = new Supporter("vali", 6, 300L);
        Person person5 = new Supporter("raj", 7, 400L);
        Person person6 = new Supporter("rahul", 9, 800L);
        Person vp1 = new VicePresident("kayne", 4, 3000L);
        Person vp2 = new VicePresident("smith", 5, 2000L);
        Person manager = new President("john", 8, 90000L);



        vp1.add(person1);
        vp1.add(person2);
        vp1.add(person3);

        System.out.println(vp1.toString());
        vp2.add(person4);
        System.out.println(vp2.toString());

        manager.add(vp1);
        manager.add(vp2);
        manager.add(person5);
        manager.add(person6);  


        System.out.println(manager.toString());


    }
}
