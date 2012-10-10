package registerOffice;

import registerOffice.businessObjects.persons.*;
import registerOffice.management.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person p = new Person("Adam");
		
		PersonManager mgr= new PersonManager();
		Condition condition = new GetByNameCondition("Adam");
		mgr.save(p);
		
		Person result = mgr.get(new Condition<Person>()
		{
			@Override
			public boolean check(Person obj) {
				return obj.getName().equalsIgnoreCase("Adam");
			}
			
		});
		
		System.out.println(result.getName());

	}

}
