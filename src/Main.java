import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and Welcome to Employee Wage Computation Program");
    	Employee e=new Employee("Ram",123);
    	int countPresent=0;
    	
    	for(int n=0;n<20;n++) {
    		Random r=new Random();
        	int i=(r.nextInt(1000))%2;	
        	
        	switch(i) {
        	case 1->{e.attendance(true); countPresent++;}
        	default->e.attendance(false);
        	}
    	}
    
    	e.normalWorkDay=8;
        System.out.println("Employee present "+countPresent +" days(out of 20)."
        		+ "Total salary for month is "+ countPresent*e.calculateWage());
    }
}
