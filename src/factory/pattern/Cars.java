/**
 * 
 */
package factory.pattern;

/**
 * @author Jayaprakash
 *
 */
public interface Cars {
	String getColor();
	String getModal();
	Double getPrice();
	
	void setColor(String color);
	void setModal(String modal);
	void setPrice(Double price);
}
