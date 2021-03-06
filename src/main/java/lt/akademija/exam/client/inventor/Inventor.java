package lt.akademija.exam.client.inventor;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lt.akademija.exam.client.Client;

@Entity
@NamedQueries({
    @NamedQuery(name = "findAllInventors", query = "select client from Inventor inventor")
})
public class Inventor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String inventorName;
	
	private double weight;
	
	private Integer sector;
	
	private Date date;
	
	@ManyToOne
	private Client client;

	public Inventor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventor(Long id, String inventorName, double weight, Integer sector, Date date, Client client) {
		super();
		this.id = id;
		this.inventorName = inventorName;
		this.weight = weight;
		this.sector = sector;
		this.date = date;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInventorName() {
		return inventorName;
	}

	public void setInventorName(String inventorName) {
		this.inventorName = inventorName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Integer getSector() {
		return sector;
	}

	public void setSector(Integer sector) {
		this.sector = sector;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
