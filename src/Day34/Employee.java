package Day34;

public class Employee {

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
        this.baseSalary = baseSalary;
    }

    // Getter
    public int getHourlyRate() {
        return hourlyRate;
    }

    // Setter
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
