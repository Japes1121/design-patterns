package abstrac.factory.pattern;

public class BikesFactory implements MotorVehiclesFactory{

	@Override
	public Bikes getBikes(String make){
		if(make.equalsIgnoreCase("Bajaj")){
			return new Bajaj();
		}
		else if (make.equalsIgnoreCase("Yamaha")){
			return new Yamaha();
		}
		else{
			return null;
		}
	}
	
	@Override
	public Cars getCars(String car){
		return null;
	}
}
