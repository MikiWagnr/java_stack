package miki.dojoninja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miki.dojoninja.models.Ninja;
import miki.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {
    @Autowired NinjaRepository ninjaRepository;

    public void createNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }
}
