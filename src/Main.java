import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and Welcome to Employee Wage Computation Program");
    	Employee e=new Employee("Ram",123);
    	e.normalWorkDay=8;
    	
    	int countPresent=0;
    	int empWage=0;
    	
    	while(countPresent!=20) {
    		Random r=new Random();
        	int i=(r.nextInt(1000))%2;	
        	
        	switch(i) {
        	case 1->{
        		e.attendance(true); 
        		countPresent++; 
        		empWage= empWage+ (e.normalWorkDay*e.salPerHour);
        	}
        	default->e.attendance(false);
        	}
        	
    	}
    
  	
        System.out.println("Employee present "+countPresent +" days(out of 20)."
        		+ "Total salary for month is "+empWage);
    }
}
