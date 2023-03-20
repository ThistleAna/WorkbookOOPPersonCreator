public class Person {
    // list all attributes here: name, age, weight, height
    private String name;
    private int age;
    private int height;
    private double weight;

    // constructor method
    public Person(String name, int age, int height, double weight){ // passing on parameters
        setName (name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }
    // getter setter method alt+insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
