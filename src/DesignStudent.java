public class DesignStudent extends Student implements Nameble, Printable {

    private String className;

    public DesignStudent(String name, int age, String specialty) {
        super(name, age, specialty);
        this.className = "DesignStudent";
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void printInfo() {
        System.out.println("Design Student: " + name);
        System.out.println("Specialty: " + specialty);
    }

    @Override
    public void showInfo() {
        System.out.println("Design Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }
}