package lt.akademija.exam.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggrazevicius
 */
@Repository
public class ClientRepository {

    @PersistenceContext
    private EntityManager entityManager;

  
    private List<Client> clientList = new ArrayList<Client>();

    @Transactional(readOnly = true)
    public Client get(Long id) {
        return entityManager.find(Client.class, id);
    }

    @Transactional
    public Client save(Client client) {
    	System.out.println(client.getFirstName());
    	
    	return entityManager.merge(client);
//    	if(client!=null){
//    		for(Client clientCheck:clientList){
//    			if(
//    					((clientCheck.getFirstName()) != (client.getFirstName())) 
//    				&&	((clientCheck.getLastName()) != (client.getFirstName())) 
//    				&&	((clientCheck.getBornDate()) != (client.getBornDate()))){
//    						return entityManager.merge(client);
//				}
//    		}
//    	}
//        return client;
    }

    @Transactional
    public void delete(Long id) {
        entityManager.remove(entityManager.find(Client.class, id));
    }

    @Transactional(readOnly = true)
    public List<Client> findAll() {

        return entityManager.createNamedQuery("findAllClients").getResultList();
    }
    
    @Transactional(readOnly = true)
    public void createAll() {
    	Client client = new Client();
    	client.setFirstName("PirmoVardas");
    	client.setLastName("pirmoPavarde");
    	entityManager.persist(client);
    	Client client1 = new Client();
    	entityManager.persist(client1);
    	Client client2 = new Client();
    	entityManager.persist(client2);

    
    }
}
