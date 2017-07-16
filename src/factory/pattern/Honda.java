/**
 * 
 */
package factory.pattern;

/**
 * @author Jayaprakash
 *
 */
public class Honda implements Cars {

	private String carColor, carModel;
	private Double carPrice;
	
	public Honda(){}
	
	public Honda(String color,String modal, Double price){
		this.carColor=color;
		this.carModel=modal;
		this.carPrice=price;
	}
	
	@Override
	public void setColor(String color)
	{
		this.carColor=color;
	}
	
	@Override
	public void setModal(String modal)
	{
		this.carModel=modal;
	}
	
	@Override
	public void setPrice(Double price)
	{
		this.carPrice=price;
	}
	
	@Override
	public String getColor()
	{
		return this.carColor;
	}
	
	@Override
	public String getModal()
	{
		return this.carModel;
	}
	
	@Override
	public Double getPrice()
	{
		return this.carPrice;
	}
}
