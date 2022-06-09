package Day29.CompanyApp_Homework;

public class CompanyMain {

    public static void main(String[] args) {

        Company amazon = new Company();
        amazon.companyName = "Amazon";
        amazon.yearCompanyFounded = 1994;
        amazon.companyField = "e-Commerce";
        amazon.ownerOfCompany = "Jeff Bezos";

        amazon.hireEmployee("Jon", "QA Engineer", 123456789);

        amazon.printProperties();

        amazon.fireEmployee();

        amazon.printProperties();

    }


}
