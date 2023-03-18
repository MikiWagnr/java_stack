package miki.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miki.dojoninja.models.Dojo;
import miki.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {
    
    @Autowired DojoRepository dojoRepository;

    public void createDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }


            //! READ ONE
            public Dojo getOneDojo(Long id){
                Optional<Dojo> optionaldojo = dojoRepository.findById(id);
                Dojo dojo = optionaldojo.orElse(null);
                return dojo;
            }
            

}
