//реалізація принципу інкапсуляції
public class Student {

    //поля класу
    private String name;
    private int age;
    private String speciatly;

    //конструктор
    public Student(String name, int age, String speciatly) {
        this.name = name;
        setAge(age);
        this.speciatly = speciatly;
    }

    //метод отримання імені
    public String getName() {
        return name;
    }

    //метод зміни імені
    public void setName(String name) {
        this.name = name;
    }

    //метод отримання віку
    public int getAge() {
        return age;
    }

    //метод зміни віку з контролем даних
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    //метод отримання спеціальності
    public String getSpeciatly() {
        return speciatly;
    }

    //метод виведення інформації про студента
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + speciatly);
    }
}
