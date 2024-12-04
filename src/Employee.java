public class Employee{
	String name;
	int id;
	//added constructor to set employee name,id
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	
    public void attendance(boolean a) {
    	if(a) {
    		System.out.println("Employee is present");
    	}
    	else {
    		System.out.println("Employee is absent");
    	}
    }
}