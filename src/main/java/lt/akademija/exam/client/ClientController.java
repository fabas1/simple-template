package lt.akademija.exam.client;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Description...
 *
 * @param ...
 * @return .....
 */
@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    
    @GetMapping("/api/createclients")
    @ApiOperation(value = "creates some clients")
    public void createClients() {
    
        clientRepository.createAll();
    }
    @GetMapping("/api/clients")
    @ApiOperation(value = "Returns all clients")
    public List<Client> getClients() {
    	
        return clientRepository.findAll();
    }

    @GetMapping("/api/clients/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientRepository.delete(id);
    }

    @RequestMapping(value="/api/clients/create", method = RequestMethod.POST)
    public Client registerClient(@RequestBody Client client) {

        return clientRepository.save(client);
    }
    
    
}
