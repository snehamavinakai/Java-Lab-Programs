//(2).Demonstrate a single inheritance

class Vehical
{
	String name;
	int regno;
	double cost;
	public Vehical(String name,int regno,double cost)
	{
		this.name = name;
		this.regno = regno;
		this.cost = cost;
	}
	public void Run()
	{
		System.out.println("Vehical is Running");
	}
	public void Display()
	{
		System.out.println("Name = "+name+" RegNo = "+regno+" Cost = "+cost);
	}
}

class Car extends Vehical
{
	public Car(String name,int regno,double cost)
	{
		super(name,regno,cost);
	}
	public void Display()
	{
		super.Display();
	}
	public void Run()
	{
        System.out.println("Car is Running");
	}
	public static void main(String[] args) {
		Car c = new Car("Tesla",2021,800000);
		c.Display();
		c.Run();
	}
}