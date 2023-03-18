package miki.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miki.dojoninja.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
}
