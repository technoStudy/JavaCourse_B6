package Day34.Encapsulation1;

public class Employee {

    // Encapsulation
        // Bundle all the related data and methods in a single unit!
        // Can hide data! (by making fields private)
        // Can create public getter(read data - get data) and public setter(updating, initializing or setting data) methods to access private fields!

    private String name;
    private int SSN;
    private int baseSalary;
    private int hourlyRate;

    public Employee(String name, int SSN) {
        this.name = name;
        this.SSN = SSN;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    // Getter
    public String getName() {
        return name;
    }

    // Getter
    public int getBaseSalary() {
        return baseSalary;
    }

    // Setter
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary cannot be less than 0!");
        this.baseSalary = baseSalary;
    }

    // Getter
    public int getHourlyRate() {
        return hourlyRate;
    }

    // Setter
    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be less than 0!");
        this.hourlyRate = hourlyRate;
    }

}
