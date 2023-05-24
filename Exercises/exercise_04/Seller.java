package exercise_04;

public class Seller {
    private String name;
    private float salary;
    private int totalMonthSales;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getTotalMonthSales() {
        return this.totalMonthSales;
    }

    public void setTotalMonthSales(int totalMonthSales) {
        this.totalMonthSales = totalMonthSales;
    }

    public float calculateSalary() {
        return this.salary + (((this.salary / 100) * 15) * this.totalMonthSales);
    }

}
