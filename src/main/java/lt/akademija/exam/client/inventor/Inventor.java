package lt.akademija.exam.client.inventor;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lt.akademija.exam.client.Client;

@Entity
public class Inventor {

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
