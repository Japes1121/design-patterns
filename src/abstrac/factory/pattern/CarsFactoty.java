package abstrac.factory.pattern;

public class CarsFactoty implements MotorVehiclesFactory {

	@Override
	public Cars getCars(String carManufacturer)
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
	
	@Override
	public Bikes getBikes(String bike){
		return null;
	}
	
	public static Cars getCars(String carManufacturer,String color,String modal,Double price)
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
