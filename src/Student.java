// Реалізація принципів ООП
public abstract class Student {

    // Поля класу
    protected String name;
    protected int age;
    protected String specialty;

    // Конструктор
    public Student(String name, int age, String specialty) {
        this.name = name;
        setAge(age);
        this.specialty = specialty;
    }

    // Метод отримання імені
    public String getName() {
        return name;
    }

    // Метод зміни імені
    public void setName(String name) {
        this.name = name;
    }

    // Метод отримання віку
    public int getAge() {
        return age;
    }

    // Метод зміни віку з перевіркою
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Метод отримання спеціальності
    public String getSpecialty() {
        return specialty;
    }

    // Статичний поліморфізм - перевантаження методу showInfo()

    // Метод без параметрів
    public abstract void showInfo();

    // Перевантажений метод з одним параметром
    public void showInfo(String subject) {
        System.out.println(
                "Студент: " + name +
                        ", предмет: " + subject
        );
    }

    // Перевантажений метод з двома параметрами
    public void showInfo(String subject, int mark) {
        System.out.println(
                "Студент: " + name +
                        ", предмет: " + subject +
                        ", оцінка: " + mark
        );
    }
}

