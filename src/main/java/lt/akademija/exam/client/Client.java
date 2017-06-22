package lt.akademija.exam.client;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lt.akademija.exam.client.inventor.Inventor;

/**
 * Client Entity...
 *
 * @param ...
 * @return .....
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "findAllClients", query = "select client from Client client")
})
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;
    
    private Date bornDate;
    
    private String phone;
    
    private boolean isLoyal;
    
    @OneToMany
    private List<Inventor> inventorList;



	public List<Inventor> getInventorList() {
		return inventorList;
	}

	public void setInventorList(List<Inventor> inventorList) {
		this.inventorList = inventorList;
	}

	public Client(Long id, String firstName, String lastName, Date bornDate, String phone, boolean isLoyal,
			List<Inventor> inventorList) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bornDate = bornDate;
		this.phone = phone;
		this.isLoyal = isLoyal;
		this.inventorList = inventorList;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isLoyal() {
		return isLoyal;
	}

	public void setLoyal(boolean isLoyal) {
		this.isLoyal = isLoyal;
	}

	public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
