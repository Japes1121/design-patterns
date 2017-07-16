package factory.pattern;

public class ClientProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars honda=CarsFactoty.GetCarsInstance("HONDA","Pearl - White","Honda - Civic",2800000d);
		System.out.println("***********************");
		System.out.println("Honda car details");
		System.out.println("Modal : "+honda.getModal());
		System.out.println("Color : "+honda.getColor());
		System.out.println("Price : "+honda.getPrice());
		System.out.println("***********************");

		Cars hyundai=CarsFactoty.GetCarsInstance("Hyundai","Silver","Hyundai - Verna",1100000d);
		System.out.println("***********************");
		System.out.println("Hyundai car details");
		System.out.println("Modal : "+hyundai.getModal());
		System.out.println("Color : "+hyundai.getColor());
		System.out.println("Price : "+hyundai.getPrice());
		System.out.println("***********************");
		
		Cars maruthi=CarsFactoty.GetCarsInstance("Maruthi","Brown","CIaz",1500000d);
		System.out.println("***********************");
		System.out.println("Maruthi car details");
		System.out.println("Modal : "+maruthi.getModal());
		System.out.println("Color : "+maruthi.getColor());
		System.out.println("Price : "+maruthi.getPrice());
		System.out.println("***********************");
		
		
	}

}
