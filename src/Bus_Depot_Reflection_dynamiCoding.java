import java.util.*;

import java.lang.reflect.Field;
public class Bus_Depot_Reflection_dynamiCoding {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Scanner sc = new Scanner(System.in);
		
		driver hk = new driver();
		System.out.print("Enter which vehicle you want ");
		Class cls = Class.forName(sc.next());
		
		
		Object obj = cls.newInstance();
		
		if(obj instanceof Vehicle v1) {
			hk.drive(v1);
		}else {
			System.out.println("No vehicles found ");
		}
	}
}
