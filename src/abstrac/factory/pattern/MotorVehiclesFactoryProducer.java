package abstrac.factory.pattern;

public class MotorVehiclesFactoryProducer {

	public static  MotorVehiclesFactory getInstance(String type)
	{
		if(type.equalsIgnoreCase("Cars")){
			return new CarsFactoty();
		}
		else if(type.equalsIgnoreCase("Bikes")){
			return new BikesFactory();
		}
		else{
			return null;
		}
	}
}
