import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and Welcome to Employee Wage Computation Program");
    	
    	Employee e1=new Employee("Ram",123);
    	
    	Random r=new Random();
    	int i=(r.nextInt(1000))%2;
    	
    	switch(i) {
    		case 1-> e1.attendance(true);
    		default-> e1.attendance(false);
    		
    	}
    	e1.normalWorkDay=8;
    	e1.calculateWage();
    	
    	Employee e2 = new Employee("Shyam", 124);
    	e2.attendance(true);
    	e2.normalWorkDay=4; //part-time employee wage is set to 4
    	
    	System.out.println("For Part-time: ");
    	e2.calculateWage();
    }
}
