package ValidatingParams;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) throws IllegalArgumentException{
        if (name == null || name.trim().isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name is not valid.");
        }
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Age entered is out of acceptable range.");
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}