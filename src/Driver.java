
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Driver {

	public static void main(String[] args) {
		// Create a configuration
		Configuration cfg = new Configuration();

		// Configure hibernate cfg file
		cfg.configure("hibernate.cfg.xml");

		// Create a session factory
		SessionFactory factory = cfg.buildSessionFactory();

		// Create a session and transaction object
		org.hibernate.Session session = factory.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();

		Company company1 = new Company(1);
		Address address1 = new Address("Church street", "Bangalore");
		company1.setAddress(address1);
		
		Item item1= new Item(1);
		session.save(item1);
		company1.getItems().add(item1);
		
		session.save(company1);
		
		tx.commit();
	}
}
