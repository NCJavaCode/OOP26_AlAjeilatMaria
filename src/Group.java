//реалізація принципу інкапсуляції
public class Group {

    //поля класу
    private String groupName;
    private String specialty;

    //конструктор
    public Group(String groupName, String specialty) {
        this.groupName = groupName;
        this.specialty = specialty;
    }

    //метод отримання назви групи
    public String getGroupName() {
        return groupName;
    }

    //метод зміни назви групи
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    //метод отримання спеціальності
    public String getSpecialty() {
        return specialty;
    }

    //метод зміни спеціальності
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //метод виведення інформації про групу
    public void showInfo() {
        System.out.println("Group: " + groupName);
        System.out.println("Specialty: " + specialty);
    }
}