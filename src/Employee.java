public class Employee{
	String name;
	int id;
	boolean attendance=false;
	int normalWorkDay;
	int salPerHour=20;
	
	
	//added constructor to set employee name,id
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public void calculateWage(){
		int dailySalary=0;
		if(attendance) {
			dailySalary=normalWorkDay*salPerHour;
			System.out.println("Daily Wage is: "+dailySalary);
		}
		else {
			System.out.println("Employee absent, wage is 0");
		}
	}
    public void attendance(boolean a) {
    	if(a) {
    		attendance=true;
    		System.out.println("Employee is present");
    	}
    	else {
    		System.out.println("Employee is absent");
    	}
    }
}