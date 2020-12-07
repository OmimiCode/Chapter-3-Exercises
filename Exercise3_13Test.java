import java.util.Arrays;

public class Exercise3_13Test {
    public static void main(String[] args) {
        Exercise3_13 employee1 = new Exercise3_13("james", "brown", 20000.00);
        Exercise3_13 employee2 = new Exercise3_13("troy", "benz", 10000.00);

        System.out.println("employee1 =  " + employee1.getFirstName() + "  " +employee1.getLastName()+ "  "+ employee1.getMonthlySalary());
        System.out.println("employee2 =  " + employee2.getFirstName() + "  " +employee2.getLastName()+ "  "+ employee2.getMonthlySalary());



        employee1.setMonthlySalary(20200.00);
        employee2.setMonthlySalary(10100.00);

        System.out.println("employee1 =  " + employee1.getFirstName() + "  " +employee1.getLastName()+ "  "+ employee1.getMonthlySalary());




        employee1.setMonthlySalary(-20.00);
        employee2.setMonthlySalary(0.00);

        System.out.println("employee1 =  " + employee1.getFirstName() + "  " +employee1.getLastName()+ "  "+ employee1.getMonthlySalary());
        System.out.println("employee2 =  " + employee2.getFirstName() + "  " +employee2.getLastName()+ "  "+ employee2.getMonthlySalary());

    }
    }



