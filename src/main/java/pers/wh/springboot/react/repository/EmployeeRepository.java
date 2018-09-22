package pers.wh.springboot.react.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import pers.wh.springboot.react.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
