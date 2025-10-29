public class ex_4 {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public ex_4(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary += salary * percent / 100;
        return this.salary;
    }

    @Override
    public String toString() {
        return "ex_4[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }


    public static void main(String[] args) {
        ex_4 e1 = new ex_4(101, "John", "Doe", 5000);
        System.out.println("e1: " + e1);
        System.out.println("ID: " + e1.getId());
        System.out.println("First Name: " + e1.getFirstName());
        System.out.println("Last Name: " + e1.getLastName());
        System.out.println("Full Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Annual Salary: " + e1.getAnnualSalary());

        ex_4 e2 = new ex_4(102, "Jane", "Smith", 6000);
        System.out.println("\ne2: " + e2);


        System.out.println("\nAfter 10% raise:");
        int newSalary = e1.raiseSalary(10);
        System.out.println("New salary: " + newSalary);
        System.out.println("e1: " + e1);


        e2.setSalary(7000);
        System.out.println("\nAfter setting new salary:");
        System.out.println("e2 salary: " + e2.getSalary());
        System.out.println("e2 annual: " + e2.getAnnualSalary());


        System.out.println("\nAfter 15% raise:");
        e2.raiseSalary(15);
        System.out.println("e2: " + e2);
    }
}