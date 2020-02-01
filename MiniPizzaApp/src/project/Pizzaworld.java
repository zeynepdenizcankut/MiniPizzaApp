package project;

public class Pizzaworld {
	
	private int total;
	private String pizza;
	private String size;
	private String extra;
	private String drink;
	
	public Pizzaworld(int t){total = t;}
	
	public int readTotal(){return total;}
	
	public void newtotal(int t)
	{
		total = t;
	}
	
	public int returnres()
	{
		return total;
	}
	
	public void details(String p, String s, String e, String d)
	{
		pizza = p;
		size = s;
		extra = e;
		drink = d;
	}
	
	public void printDetails(){
		   System.out.println("Order Details");
		   System.out.println("============");
		   System.out.println("Your pizza size selected is " + size);
		   System.out.println("Your pizza selected is " + pizza);
		   System.out.println("Your extra selected is " + extra);
		   System.out.println("Your drink selected is " + drink);		   
		   System.out.println("Total cost: "+total);
		   }

}
