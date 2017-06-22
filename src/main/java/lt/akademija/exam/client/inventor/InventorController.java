package lt.akademija.exam.client.inventor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import lt.akademija.exam.client.Client;
import lt.akademija.exam.client.ClientRepository;

@RestController
public class InventorController {

    @Autowired
    private InventorRepository inventorRepository;

//    
//    @GetMapping("/api/createclients")
//    @ApiOperation(value = "creates some clients")
//    public void createClients() {
//    
//        clientRepository.createAll();
//    }
    @GetMapping("/api/invertors")
    @ApiOperation(value = "Returns all invertos")
    public List<Inventor> getInvertors() {
    	
        return inventorRepository.findAll();
    }
//
//    @GetMapping("/api/clients/delete/{id}")
//    public void deleteClient(@PathVariable Long id) {
//        clientRepository.delete(id);
//    }

    @RequestMapping(value="/api/inventor/create", method = RequestMethod.POST)
    public Inventor registerInventor(@RequestBody Inventor inventor) {
    	
        return inventorRepository.saveInventor(inventor);
    }
    
    
}
