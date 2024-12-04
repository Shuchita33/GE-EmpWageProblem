import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and Welcome to Employee Wage Computation Program");
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();   	
    	
    	Employee e = new Employee(name, id);
    	
    	System.out.println("Is present? No/Yes (enter 0/1):");
    	int isPresent = sc.nextInt();
    	switch(isPresent) {
    	case 1->e.attendance(true);
    	default->e.attendance(false);
    	}

    	System.out.println("Enter \n1.Part-time\n2.Full-time :");
    	int empType = sc.nextInt();
    	
    	switch(empType) {
    	case 1->e.normalWorkDay=4;
    	default->e.normalWorkDay=8;
    	
    	}
    	
    	e.calculateWage();
    }
}
