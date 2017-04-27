package TestStream;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Serializable.Person;

public class ReadObject
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		try
		{
			FileInputStream fis = new FileInputStream("person.object");
			ObjectInputStream ois =new ObjectInputStream(fis);
			Person person1 =(Person)ois.readObject();
			Person person2 =(Person)ois.readObject();
			
			System.out.println(person1);
			System.out.println(person2);
			ois.close();
		} catch (IOException e)
		{
			e.getStackTrace();
		}
	}

}