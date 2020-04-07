public class Person {
    private String firstName;
    private String lastName;
    private int age;

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

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age >100) age = 0;
        else this.age = age;
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) return true;
        else return false;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        if (this.firstName.isEmpty()) return this.getLastName();
        if (this.lastName.isEmpty()) return this.getFirstName();

        return this.getFirstName() + " " + this.getLastName();
    }
}
