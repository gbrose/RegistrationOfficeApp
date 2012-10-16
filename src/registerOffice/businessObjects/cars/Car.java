package registerOffice.businessObjects.cars;

import registerOffice.businessObjects.persons.Person;

public abstract class Car implements CarInterface{

	protected Person owner;
	protected String mark;
	protected String registerNumber;
	
	public void printData()
	{
		System.out.println("Owner: "+owner.getName());
		System.out.println(getCarDetails());
	}
	
	public abstract String getCarDetails();
	
	public abstract Car Clone();
	
	public void setOwner(Person owner) { this.owner=owner; }
	
	//wlasciwosci
	public String getMark() { return mark; }
	public void setMark(String mark) { this.mark = mark; }
	public String getRegisterNumber() { return registerNumber; }
	public void setRegisterNumber(String registerNumber) { this.registerNumber = registerNumber; }
}
