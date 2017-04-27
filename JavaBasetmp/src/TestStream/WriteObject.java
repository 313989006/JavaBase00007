package TestStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Serializable.Person;

public class WriteObject
{

	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fos =new FileOutputStream("person.object");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Person(1, "Jack", 1234));;
			oos.writeObject(new Person(2, "Rose", 5678));
			oos.close();
			System.out.println("Success!");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
