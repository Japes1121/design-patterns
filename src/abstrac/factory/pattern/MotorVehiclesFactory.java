package abstrac.factory.pattern;

public interface MotorVehiclesFactory {

	Cars getCars(String car);
	Bikes getBikes(String bike);
}
