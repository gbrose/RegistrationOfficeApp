package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.cars.Car;

public class CarManager implements ManagerInterface<Car>
{
	private List<Car> cars = DatabaseContext.getCars();
	
	@Override
	public Car get(Condition<Car> condition)
	{
		for(Car c : cars)
		{
			if(condition.check(c))
				return c;
		}
		
		return null;
	}

	@Override
	public List<Car> getAll() { return cars; }

	@Override
	public boolean save(Car obj)
	{ 
		for(Car c : cars)
		{
			if(c.getRegisterNumber().equalsIgnoreCase(obj.getRegisterNumber()))
				return false;
		}
		
		return cars.add(obj);
	}

	@Override
	public boolean delete(Car obj) { return cars.remove(obj); }
}
