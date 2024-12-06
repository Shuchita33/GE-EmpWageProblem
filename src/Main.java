
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and Welcome to Employee Wage Computation Program");
    	Employee e=new Employee("Ram",123);
    	e.normalWorkDay=8;
    	e.countMonthlyWage();
        System.out.println("Total salary for month is "+e.totalWage);
        
    }
}
