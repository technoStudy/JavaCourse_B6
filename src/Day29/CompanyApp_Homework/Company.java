package Day29.CompanyApp_Homework;

public class Company {

    String companyName;
    int yearCompanyFounded;
    String companyField;
    String ownerOfCompany;
    Employee employee;


    void hireEmployee(String employeeName, String employeeTitle, int ssn) {
        employee = new Employee();
        employee.employeeName = employeeName;
        employee.title = employeeTitle;
        employee.ssn = ssn;
    }

    void fireEmployee() {
        employee = null;
    }

    void printProperties() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Year " + companyName + " Founded " + yearCompanyFounded);
        System.out.println("Company Field: " + companyField);
        System.out.println("Owner of Company: " + ownerOfCompany);
        if (employee != null)
            employee.printProperties();
    }

}
