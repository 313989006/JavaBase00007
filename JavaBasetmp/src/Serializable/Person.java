package Serializable;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private int personID;
	private String name;
	protected int pass;
		
	
	public Person(int personID, String name, int pass)
	{
		this.personID =personID ;
		this.name =name;
		this.pass =pass;
	}
	@Override
	public String toString(){
		return "personID : " + personID + "\tName : " + name + "\tPass : " + pass;
		
	}

}
