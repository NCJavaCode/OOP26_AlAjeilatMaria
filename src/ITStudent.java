public class ITStudent extends Student {

    public ITStudent(String name, int age, String specialty) {
        super(name, age, specialty);
    }

    @Override
    public void showInfo() {
        System.out.println("IT Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }
}