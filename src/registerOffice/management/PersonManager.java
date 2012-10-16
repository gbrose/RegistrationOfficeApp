package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public class PersonManager implements ManagerInterface<Person>
{
	private List<Person> persons = DatabaseContext.getPersons();
	
	@Override
	public Person get(Condition<Person> condition)
	{
		for(Person p : persons)
		{
			if(condition.check(p))
				return p;
		}
		
		return null;
	}

	@Override
	public List<Person> getAll() { return persons; }

	@Override
	public boolean save(Person obj)
	{
		for(Person p : persons)
		{
			if(p.getPesel().equals(obj.getPesel()))
				return false;
		}
		
		return persons.add(obj);
	}

	@Override
	public boolean delete(Person obj) { return persons.remove(obj); }
}
