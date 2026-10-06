public class Main {

    public static void main(String[] args) {

        ITStudent itStudent = new ITStudent(
                "Maria",
                18,
                "Інженерія програмного забезпечення"
        );

        DesignStudent designStudent = new DesignStudent(
                "Anna",
                19,
                "Дизайн"
        );

        itStudent.showInfo();

        System.out.println();

        designStudent.showInfo();
    }
}