package model;

import java.util.List;

import model.Restaurant; 
import model.User; 

public class AppRoot {
	
	private static AppRoot instance = new AppRoot(); 
	private List<Restaurant> restaurants; 
	private List<User> users; 
	
	private AppRoot(){}	
	
	public static AppRoot getAppRootInstance() {
		return instance; 
	}
	
	public static Restaurant getRestaurantByName(String name) {
		return null; 
	}

	public static User getUserByName() {
		return null;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public boolean deleteRestaurant(Restaurant restaurant) {
		return true; 
	}
	
	public boolean deleteUser(User user) {
		return true; 
	}
	
	public boolean addUser(User user) {
		return true; 
	}
	
	public boolean addRestaurant(Restaurant restaurant) {
		return true; 
	}
}
