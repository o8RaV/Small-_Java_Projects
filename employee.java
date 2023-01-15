import java.util.*;
public class employee {
    public static void main(String[] args) {
        HourlyEmployee a = new HourlyEmployee(23, "Barney Rubble", 1.25, 50.0);
        SalariedEmployee b = new SalariedEmployee(69, "rav", 12000);
        HourlyEmployee c = new HourlyEmployee(10, "shiv", 20, 200);
        List<employee> employees = List.of(a, b, c);
        company abcinternationa = new company(employees);
        abcinternationa.pay_all(01, 01);
        double p = abcinternationa.total_payroll();
        System.out.println(p);
    }
    int ID;
    String name;
    int total;
    // Constructor/Initializer
    employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
        this.total = 0;
    }
    public double get_monthly_payment() {
      throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
    public void pay(String date) {
     double payment = this.get_monthly_payment();
     this.total += payment;
     System.out.println("An employee was paid " + payment + " on " + date +".");
    }
    public double total_pay() {
        return this.total;
    }
}
class SalariedEmployee extends employee {
    int id;
    String name;
    double salary;
    SalariedEmployee(int id_, String name, double salary) {
        super(id_, name);
        this.salary = salary;
    }
    public double get_monthly_payment() {
        return Math.round(this.salary / 12.0);
    }
}
class HourlyEmployee extends employee {
    int id;
    String name;
    double hw;
    double hpm;
    HourlyEmployee(int id_, String name, double hww, double hpmm) {
        super(id_, name);
        this.hw = hww;
        this.hpm = hpmm;
    }
    public double get_monthly_payment() {
        double mt = this.hpm * this.hw;
        return Math.round(mt);
    }
}
class company {
    List<employee> employees;
    double company_paid;

    company(List<employee> employees) {
        this.employees = employees;
        this.company_paid = 0;
    }
    void pay_all(int month, int date) {
        for (employee i : this.employees) {
            i.pay(month + " " + date);
            company_paid = company_paid + i.get_monthly_payment();
        }
    }
    double total_payroll() {
        return company_paid;
    }
}

