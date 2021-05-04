package coffeeShopDemo;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Anıl");
		customer1.setLastName("Ağhan");
		customer1.setYearOfBirth(1991);
		customer1.setNationalityId(36319158736L);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);

	}

}
