/**
 * Java.Homework5
 *
 * @author Egor Vyatkin
 * version 12.10.2021
 */
 class Lesson5 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee ("Otavin Andrey", "Director", "oa@p-gss.net", "2202504", 200000, 48),
            new Employee ("Milov Maxim", "Associate Director", "mm@p-gss.net", "2202710", 150000, 40),
            new Employee ("Kalinini Igor", "Head of department", "ki@p-gss.net", "2202071", 130000, 55),
            new Employee ("Noskov Alan", "Deputy head of department", "na@p-gss.net", "2202535", 100000, 39),
            new Employee ("Cheerful worker", "Engineer", "cw@p-gss.net", "2204534", 80000, 36)
        };

        for (Employee employee : employees) {
            if(employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String name;
    private String profession;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String name, String profession, String email, String phone,
            int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() { // getter for age
        return age;
    }

    @Override
    public String toString() { // overrided method toString()
        return (name +
            "\n| Profession: " + profession +
            "\n| Email: " + email +
            "\n| Phone: " + phone +
            "\n| Salary: " + salary +
            "\n| Age: " + age);
    }
}
