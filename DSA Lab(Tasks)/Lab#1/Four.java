class Courrier
{
	//Instance Variables
	int poids;
	boolean isExpress;
	String address;
	boolean isNotValid;
	//Default Constructor
	public Courier()
	{

	}
	//Perameterized Constructor
	public Courrier(int poids,boolean isExpress,String address)
	{

	}
	//isExpress Method
	public boolean isExpress()
	{
		return isExpress;
	}
	//affainchinCourrier Method
	public double affranchinCourrier()
	{
		return 0;
	}
	//afficher Method
	public void afficher()
	{

	}
}
//Child class of Courrier or Publicite Class extending Courrier Class
class Publicite extends Courrier
{
	//instance Variable
	double prix;
	//Perameterized Constructor of Publicite Class
	public Publicite(int poids, boolean isExpress, String address) {
		super();

	}
	//getPrix Method or Getter for Instance Variable prix
	public double getPrix()
	{
		return 0;
	}
	//Overriden affincher Method
	public void affincher()
	{

	}
	//Overriden affranchirCourier Method
	public double affranchirCourrier()
	{
		return 0;
	}
}
//Child Class of Courrier or Lettre Class which is extending Courrier
class Lettre extends Courrier
{
	//Instance Variables
	String format;
	double prix = 0;
	//Parameterized Constructor for Lettre Class
	Lettre(int poids,boolean isExpress,String address,String format)
	{
		super();
	}
	//getter for prix variable
	public double getPrix()
	{
		return prix;
	}
	//Overriden afficher method
	public void afficher()
	{

	}
	//overriden affranchirCourrier Method
	public double affranchirCourrier()
	{
		return 0;
	}
}
//Child Class of Courrier or Colis Class that is extending Courrier Class
class Colis extends Courrier
{
	//Insatnce Variables
	double volume;
	double prix;

	
	//Perameterized constructor of Colis Class
	Colis(int poids, boolean isExpress, boolean address, double volume) {
		super();

	}
	//Getter for prix variable
	public double getPrix()
	{
		return 0;
	}
	//Overriden Method affinchir
	public void affinchir()
	{

	}
	//Overriden Method affranchinCourrier
	public double affranchinCourrier()
	{
		return 0;
	}
}