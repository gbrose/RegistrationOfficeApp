package registerOffice;

import registerOffice.businessObjects.cars.Car;
import registerOffice.businessObjects.cars.PersonCar;
import registerOffice.businessObjects.persons.*;
import registerOffice.management.*;

public class Main {

	public static void main(String[] args)
	{
		PersonManager personManager = new PersonManager();
		CarManager carManager = new CarManager();
		
		carManager.save(new PersonCar("marka1", "numer1"));
		carManager.save(new PersonCar("marka2", "numer2"));
		
		personManager.save(new Person("osoba1", "pesel1"));
		personManager.save(new Person("osoba2", "pesel2"));
		
		Person p = personManager.get(new Condition<Person>()
		{
			@Override
			public boolean check(Person obj) { return obj.getName().equalsIgnoreCase("osoba2"); }
		});
		
		Car c = carManager.get(new Condition<Car>()
		{
			@Override
			public boolean check(Car obj) { return obj.getRegisterNumber().equalsIgnoreCase("numer1"); }
		});
	}

}
