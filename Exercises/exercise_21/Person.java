package exercise_21;

public class Person {
    private enum Sex {
        M, F
    }

    private String name;
    private Sex sex;
    private int age;
    private boolean healthy;

    public Person(String name, String sex, int age, boolean healthy) {
        setName(name);
        setSex(sex);
        setAge(age);
        setHealthy(healthy);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSex(String sex) throws Exception {
        if (sex.equals("M") || sex.equals("F")) {
            this.sex = sex;
        } else {
            throw new Exception("Invalid option");
        }
    }

    public Sex getSex() {
        return this.sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isHealthy() {
        return this.healthy;
    }
}
