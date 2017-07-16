package singleton.pattern;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1=Singleton.getSingletonInstance();
		Singleton s2=Singleton.getSingletonInstance();
		Singleton s3=Singleton.getSingletonInstance();
		Singleton s4=Singleton.getSingletonInstance();
		Singleton s5=Singleton.getSingletonInstance();
		
		Singleton ins1=Singleton.getNSingletonInstance();
		Singleton ins2=Singleton.getNSingletonInstance();
		Singleton ins3=Singleton.getNSingletonInstance();
		Singleton ins4=Singleton.getNSingletonInstance();
		Singleton ins5=Singleton.getNSingletonInstance();
		
		System.out.println("Singleton.getSingletonInstance()");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("Singleton.getNSingletonInstance()");
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
		System.out.println(ins4);
		System.out.println(ins5);
		
	}

}
