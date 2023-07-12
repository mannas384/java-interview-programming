import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Vwits {
    public static void main(String[] args) {
        /*
            Employees from Dev Department
            Age greater than 24
            Sorted by there salary in desc
            Only name 1st 3 Employees

*/


         /*

            Employees in each City with their counting
            {Bihar=1, Delhi=2, Navi Mumbai=2, Nagpur=1, Amritsar=1, Kolkata=1, Pune=3, Mumbai=2, Bangalore=1, Jalgoan=1}
         */
        Data data = new Data();
      Map<String,Long> resMap =  Data.departments.stream().flatMap(d->d.getEmployees().stream()).
                collect(Collectors.groupingBy(e->e.address.getCity(),Collectors.counting()));

        System.out.println(resMap);





    }
}

class Data {
    static private List<Employee> empListDev = Arrays.asList(
            new Employee(1, "Rushikesh", "Karkhanis", 25, 10000,
                    new Address("Navi Mumbai", "Sanpada", 400706))
            ,
            new Employee(2, "Aarju", "Tripati", 23, 15000,
                    new Address("Pune", "Hinjewadi", 500506))
            ,
            new Employee(3, "Sachin", "Narang", 25, 20000,
                    new Address("Pune", "Hinjewadi", 400708))
            ,
            new Employee(4, "Sachin", "Narang", 26, 20000,
                    new Address("Pune", "Hinjewadi", 400708))
            ,
            new Employee(5, "Nupur", "Shah", 27, 25000,
                    new Address("Nagpur", "PremNagar", 100806))
            ,
            new Employee(6, "Priyanka", "Das", 24, 30000,
                    new Address("Kolkata", "Bangur", 900700))

    );
    static private List<Employee> empListQA = Arrays.asList(
            new Employee(1, "Rajesh", "Patil", 28, 60000,
                    new Address("Jalgoan", "Kopri", 401706))
            ,
            new Employee(2, "Masoom", "Jain", 29, 75000,
                    new Address("Mumbai", "Bandra", 500506))
            ,
            new Employee(3, "Biju", "Singh", 30, 80000,
                    new Address("Amritsar", "Gulab Bagh", 400708))
    );

    static private List<Employee> empListDevOps = Arrays.asList(
            new Employee(1, "Javed", "Shaik", 28, 60000,
                    new Address("Delhi", "Firadabad", 401706))
            ,
            new Employee(2, "Tiwari", "Chandramani", 29, 75000,
                    new Address("Bihar", "Nagar", 800506))
            ,
            new Employee(3, "Nilesh", "Firke", 35, 80000,
                    new Address("Navi Mumbai", "Belapur", 400708))
    );
    static private List<Employee> empListManager = Arrays.asList(
            new Employee(1, "Rohan", "Kumar", 38, 160000,
                    new Address("Delhi", "Firadabad", 401706))
            ,
            new Employee(2, "KumarPal", "Jain", 39, 175000,
                    new Address("Bangalore", "Nagar", 800506))
            ,
            new Employee(3, "Mayur", "Chitnis", 45, 180000,
                    new Address("Mumbai", "Belapur", 400708))
    );

    public static List<Department> departments = Arrays.asList(
            new Department(1, "Dev", empListDev),
            new Department(2, "Qa", empListQA),
            new Department(3, "DevOps", empListDevOps),
            new Department(4, "Manager", empListManager));
}

class Department {
    int departmentId;
    String departmentName;
    List<Employee> employees;

    public Department(int departmentId, String departmentName, List<Employee> employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

}

class Employee {
    int employeeId;
    String firstName;
    String lastName;
    int age;
    int salary;
    Address address;
    public Employee(int employeeId, String firstName, String lastName, int age, int salary, Address address) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", address=" + address +
                '}';
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public Address getAddress() {
        return address;
    }
}

class Address {
    String city;
    String area;
    int pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    public Address(String city, String area, int pinCode) {
        this.city = city;
        this.area = area;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

}