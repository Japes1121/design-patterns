package factory.pattern;

public class CarsFactoty {

	public static Cars GetCarsInstance(String carManufacturer)
	{
		if(carManufacturer.equalsIgnoreCase("HONDA"))
		{
			return new Honda();
		}
		else if(carManufacturer.equalsIgnoreCase("HYUNDAI"))
		{
			return new Hyundai();
		}
		else if(carManufacturer.equalsIgnoreCase("Maruthi"))
		{
			return new Maruthi();
		}
		else
		{
			return null;
		}
	}
	
	public static Cars GetCarsInstance(String carManufacturer,String color,String modal,Double price)
	{
		if(carManufacturer.equalsIgnoreCase("HONDA"))
		{
			return new Honda(color,modal,price);
		}
		else if(carManufacturer.equalsIgnoreCase("HYUNDAI"))
		{
			return new Hyundai(color,modal,price);
		}
		else if(carManufacturer.equalsIgnoreCase("Maruthi"))
		{
			return new Maruthi(color,modal,price);
		}
		else
		{
			return null;
		}
	}
	
}
