//Importing pacakge
import java.util.Scanner;
class Area
{	
    //Instance Variable
        double area;
    //Class Variable
	static Scanner sc=new Scanner(System.in);
	//Constructor which takes two parameter and set variable(area)
	public Area(double length,double breath)
	{
		area=length*breath;
	}
    //Method that would return area
	public double returnArea()
	{
		return area;
	}
    //Main Method
	public static void main(String[] args)
	{
	//Local variales
		double length;
		double breath;
	//Taking input from user
		System.out.println("Enter Length");
		length=sc.nextDouble();
		System.out.println("Enter Breadth");
		breath=sc.nextDouble();
	//Object creating
		Area area=new Area(length,breath);
		System.out.println("Area of Rectangle is "+area.returnArea());
	}

}