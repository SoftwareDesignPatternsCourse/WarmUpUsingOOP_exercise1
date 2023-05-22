import java.util.ArrayList;

import com.vehicles.Vehicle;

public class WarmUPUsingOOP {

	
	public static void main(String[] args) {
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add(new Vehicle("car"));
		list.add(new Vehicle("boat"));
		for (Vehicle vehicle : list) {
			vehicle.move();
		}
	}
	
}
