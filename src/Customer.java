import java.util.ArrayList;
import java.util.List;


public class Customer {

	private List<Company> companies = new ArrayList<Company>();
	private int customerId;
	
	public Customer(int customerId)
	{
		this.customerId = customerId;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
