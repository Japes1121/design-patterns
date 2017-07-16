package abstrac.factory.pattern;

public class Yamaha implements Bikes{

	String modal;
	@Override
	public void setModal(String modal){
		this.modal=modal;
	}
	
	@Override
	public void getModal()
	{
		System.out.println("Yamaha Bike modal : "+this.modal);
	}
	
}
