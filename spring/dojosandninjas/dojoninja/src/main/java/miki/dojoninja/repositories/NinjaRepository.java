package miki.dojoninja.repositories;

import org.springframework.data.repository.CrudRepository;

import miki.dojoninja.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    
}
