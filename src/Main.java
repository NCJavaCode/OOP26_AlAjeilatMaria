public class Main {

    public static void main(String[] args) {

        Student student = new ITStudent(
                "Марія",
                18,
                "Інженерія програмного забезпечення"
        );

        student.showInfo();

        student.showInfo("Програмування");

        student.showInfo("Програмування", 85);
    }
}