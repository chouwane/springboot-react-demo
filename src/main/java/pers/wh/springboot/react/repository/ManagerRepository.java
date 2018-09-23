package pers.wh.springboot.react.repository;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pers.wh.springboot.react.entity.Manager;

@RepositoryRestResource(exported = false)
public interface ManagerRepository extends Repository<Manager, Long> {

    Manager save(Manager manager);

    Manager findByName(String name);

}
