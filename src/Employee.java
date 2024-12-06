import java.util.Random;

public class Employee{
	String name;
	int id;
	boolean attendance=false;
	static int normalWorkDay;
	static int salPerHour=20;
	int totalWage = 0; // Total monthly wage
    int totalDaysPresent = 0; // Total days the employee was present
	
	
	//added constructor to set employee name,id
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public static int calculateDailyWage() {
        return normalWorkDay * salPerHour;
    }
	
	public void countMonthlyWage() {
	while(totalDaysPresent!=20) {
		Random r=new Random();
    	int i=(r.nextInt(1000))%2;	
    	
    	if(i==1) {
    		this.totalDaysPresent++;
    		this.totalWage+=calculateDailyWage();
    	}
    	i++;
    	//System.out.println(this.totalDaysPresent);
    }
	}
    	
} 
