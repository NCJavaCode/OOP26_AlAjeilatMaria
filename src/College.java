//реалізація принципу інкапсуляції
public class College {

    //поля класу
    private String name;
    private String city;

    //конструктор
    public College(String name, String city) {
        this.name = name;
        this.city = city;
    }

    //метод отримання назви коледжу
    public String getName() {
        return name;
    }

    //метод зміни назви коледжу
    public void setName(String name) {
        this.name = name;
    }

    //метод отримання міста
    public String getCity() {
        return city;
    }

    //метод зміни міста
    public void setCity(String city) {
        this.city = city;
    }

    //метод виведення інформації про коледж
    public void showInfo() {
        System.out.println("College: " + name);
        System.out.println("City: " + city);
    }
}