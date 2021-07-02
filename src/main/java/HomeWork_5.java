import java.security.Security;

public class HomeWork_5 {

    public static void main(String[] args) {

        Employee empTest = new Employee();

        //Employee john = new Employee("John Smith", "Developer", "johnsmith@test.com", "+1 999 999 9999", 4000, 35 );
        Employee natalie = new Employee("Natalie Winston", "Analyst", "nataliewin@test.com","+1 800 535 3535", 4600, 30);
        Employee sergei = new Employee("Sergei Bezzubov", "Security Engineer","sergeiironballs@test.com","+1 999 777 6996",4450,25);

        Employee[] arrEmp = new Employee[5];
        arrEmp[0] = new Employee("John Smith", "Developer", "johnsmith@test.com", "+1 999 999 9999", 4000, 35);
        arrEmp[1] = new Employee("Natalie Winston", "Analyst", "nataliewin@test.com","+1 800 535 3535", 4600, 41);
        arrEmp[2] = new Employee("Sergei Bezzubov", "Security Engineer","sergeiironballs@test.com","+1 999 777 6996",4450,25);
        arrEmp[3] = new Employee("Victor Reznov", "Security", "callofcall@test.com", "+1 764 345 2332", 2000, 50);
        arrEmp[4] = new Employee("Anna Harrison","Secretary", "anya@test.com","+1 234 543 32 90", 2500,23);

        for (int i = 0; i < arrEmp.length; i++) {
            if(arrEmp[i].age>40) {
                arrEmp[i].printInfo();
            }
        }




    }
}
