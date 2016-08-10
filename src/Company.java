import java.util.ArrayList;
import java.util.List;


public class Company {

	private int companyId;
    private Address address;
    private List<Item> items = new ArrayList<Item>();
    private List<Customer> customers = new ArrayList<Customer>();
    
    public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Company(int companyId)
    {
    	this.companyId = companyId;
    }
	

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	
}
