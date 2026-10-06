public class DesignStudent extends Student {

    public DesignStudent(String name, int age, String speciatly) {
        super(name, age, speciatly);
    }

    @Override
    public void showInfo() {
        System.out.println("Design Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + speciatly);
    }
}