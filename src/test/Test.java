package test;

import java.util.HashMap;

import org.apache.catalina.tribes.util.Arrays;

import com.ozgr.model.Address;
import com.ozgr.model.Person;

public class Test {

	public static void main(String[] args) {
		
		HashMap<Person,Integer> map = new HashMap<Person,Integer>();
		Address address1 = new Address("1","1","kozan","ankara","06");
		Address address2 = new Address("1","1","kozan","ankara","06");
		System.out.println(address1.equals(address2));
		String phone1[] = {"1122","2233"};
		String phone2[] = {"1122","2233"};
		map.put(new Person("ali","veli","ali@gmail.com",phone1,address1), Integer.valueOf(1));
		System.out.println(map.get(new Person("ali","veli","ali@gmail.com",phone2,address2)));
	}

}
