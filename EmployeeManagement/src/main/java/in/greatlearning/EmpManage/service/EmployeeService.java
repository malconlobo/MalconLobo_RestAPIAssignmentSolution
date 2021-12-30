package in.greatlearning.EmpManage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;

import in.greatlearning.EmpManage.entities.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	Optional<Employee> findById(int id);
	
	void save(Employee employee);
	
	void deleteById(int id);
	
	List<Employee> findByFirstName(String firstName);
	
	List<Employee> findAllSortByFirstName(Direction direction);

}
