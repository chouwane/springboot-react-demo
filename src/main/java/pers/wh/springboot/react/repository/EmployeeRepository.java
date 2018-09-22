package pers.wh.springboot.react.repository;

import org.springframework.data.repository.CrudRepository;
import pers.wh.springboot.react.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
