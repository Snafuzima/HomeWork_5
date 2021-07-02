public class Employee {

    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    int number;
    static int counter;

    public Employee() {

    }

    public Employee(String fullName,String position, String email, String phoneNumber, int salary,int age) {

        counter++;
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age =age;
        this.number=counter;



    }

    public void printInfo() {
        System.out.printf("Full name: %s\nPosition: %s\nEmail: %s\nPhone Number: %s\nSalary: %d\nAge: %d\nNumber: %d\n", fullName, position,email,phoneNumber,salary,age,number);
    }

    public void printCounter() {
        System.out.println("Counter = "+counter);
    }

    public void isRetired() {

    }
}
