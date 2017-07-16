package abstrac.factory.pattern;

public class ClientProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotorVehiclesFactory mf=MotorVehiclesFactoryProducer.getInstance("Cars");

		Cars c=mf.getCars("HONDA");
		c.setModal("City");
		System.out.println("Car Make : "+c.getClass());
		System.out.println("Car modal : "+c.getModal());
		
		MotorVehiclesFactory mf1=MotorVehiclesFactoryProducer.getInstance("Bikes");
		
		Bikes b=mf1.getBikes("Bajaj");
		
		b.setModal("Pulsar - 150");
		System.out.println("Car Make : "+b.getClass());
		b.getModal();
		
	}

}
