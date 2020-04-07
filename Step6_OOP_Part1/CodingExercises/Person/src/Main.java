public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullname= " + person.getFullName());        //expect fullname=
        System.out.println("teen= " + person.isTeen());                 //expect false

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullname= " + person.getFullName());        //expect John
        System.out.println("teen= " + person.isTeen());                 //expect true

        person.setLastName("Smith");
        System.out.println("fullname= " + person.getFullName());        //expect John Smith
    }
}
