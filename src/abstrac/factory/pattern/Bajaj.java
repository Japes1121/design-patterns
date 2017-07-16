package abstrac.factory.pattern;

public class Bajaj implements Bikes{

	String modal;
	@Override
	public void setModal(String modal){
		this.modal=modal;
	}
	
	@Override
	public void getModal()
	{
		System.out.println("Bajaj Bike modal : "+this.modal);
	}
	
}
