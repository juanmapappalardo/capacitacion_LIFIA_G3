package modelo; 

import Restaurant; 
import User; 

public class AppRoot {
	
	//private static AppRoot instance; 
	
	private AppRoot{}	
	
	public static AppRoot getAppRootInstance() {
		return isntance; 
	}
	
	public static Restaurant getRestaurantByName(String name) {
		return null; 
	}

	public static User getUserByName() {
		return null;
	}
}
