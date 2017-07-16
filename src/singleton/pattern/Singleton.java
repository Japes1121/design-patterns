package singleton.pattern;

public class Singleton {

	private static Singleton obj;
	private static Singleton objN;
	private static int objCount=1;
	private static int objNCount=1;
	//restrict instantiation by declaring this construcor as private
	private Singleton(){}
	
	//return only 3 instance if greater than that returns null
	public static synchronized Singleton getSingletonInstance()
	{
		if(objCount <=3 ){
			objCount++;
		 return new Singleton();
		}
		else{
			return null;
		}
	}
	
	
	//returns first three instance as a new one and in rest cases return the third instance 
	public static synchronized Singleton getNSingletonInstance(){
		if(objNCount <= 3){
			objNCount++;
			objN = new Singleton();
		}
		return objN;
	}
	
}
