class Employee
{	
    //Instance Variables
	int noOfHours;
	double salary;

    //Method to set the values of Instance variable
	public void getInfo(double salary,int noOfHours)
	{
		this.noOfHours=noOfHours;
		this.salary=salary;
	}
    //Method which would increase the salary if salary<500
	public void addSal()
	{
		if(salary<500)
		{
			salary+=10;
		}
	}
    //Method that would increase the salary if hours>6
	public void addWorkbonus()
	{
		if(noOfHours>6)
		{
			salary+=5;
		}
	}
    //Method to print the total salary
	public void printSalary()
	{
		System.out.println("Final Salary is "+salary);
	}
    //Main Method
	public static void main(String[] nah)
	{
	//Object creation
		Employee employee=new Employee();
	//Methods calling
		employee.getInfo(100,7);
		employee.addSal();
		employee.addWorkbonus();
		employee.printSalary();
	}

}