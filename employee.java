import java.util.*;

public class employee {
    public static void main(String[] args) {
        String[] id = { "E3626", "E1112", "E8877", "E2881", "E9882" };
        String[] Emp_name = { "Manish", "Rohan", "Amit", "Saurav", "Marnus" };
        String[] joindate = { "21/10/2014", "10/10/2010", "02/12/2022", "15/01/2019", "20/04/2012" };

        String[] dcode = { "Er", "An", "Sr", "Mg", "Ce" };

        int[] basic = { 15000, 18000, 35900, 45000, 90000 };
        int[] hra = { 1000, 2300, 4500, 1022, 2030 };
        int[] it = { 12000, 14000, 10000, 4000, 20000 };
        int index = -1;
        String designation = "";
        int da = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the id: ");
        String eid = sn.nextLine();

        for (int i = 0; i < 5; i++) {
            if (id[i].equals(eid)) {
                index = i;
                break;
            }
        }
        switch (index) {
            case 0:
                designation = "Engineer";
                da = 3000;
                System.out.println("Name of the Employee is: " + Emp_name[0]);
                System.out.println("Desgination of the employee is: " + designation);
                System.out.println("Salary of the employee is: " + (basic[0] + hra[0] + it[0] + da));
                break;
            case 1:
                designation = "Analyst";
                da = 10000;
                System.out.println("Name of the Employee is: " + Emp_name[1]);
                System.out.println("Desgination of the employee is: " + designation);
                System.out.println("Salary of the employee is: " + (basic[1] + hra[1] + it[1] + da));
                break;
            case 2:
                designation = "Senior Engineer";
                da = 40000;
                System.out.println("Name of the Employee is: " + Emp_name[2]);
                System.out.println("Desgination of the employee is: " + designation);
                System.out.println("Salary of the employee is: " + (basic[2] + hra[2] + it[2] + da));
                break;
            case 3:
                designation = "Manager";
                da = 50000;
                System.out.println("Name of the Employee is: " + Emp_name[3]);
                System.out.println("Desgination of the employee is: " + designation);
                System.out.println("Salary of the employee is: " + (basic[3] + hra[3] + it[3] + da));
                break;
            case 4:
                designation = "Cloud Analyst";
                da = 60000;
                System.out.println("Name of the Employee is: " + Emp_name[4]);
                System.out.println("Desgination of the employee is: " + designation);
                System.out.println("Salary of the employee is: " + (basic[4] + hra[4] + it[4] + da));
                break;
            default:
                System.out.println("No Employee with such Id.....");
                break;
        }
    }
}
