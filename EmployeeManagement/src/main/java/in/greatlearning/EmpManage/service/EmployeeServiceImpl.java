package in.greatlearning.EmpManage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import in.greatlearning.EmpManage.entities.Employee;
import in.greatlearning.EmpManage.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);

	}

	@Override
	public List<Employee> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher(firstName, ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "lastName", "email");
		Example<Employee> example = Example.of(employee, exampleMatcher);
		return employeeRepository.findAll(example);
	}

	@Override
	public List<Employee> findAllSortByFirstName(Direction direction) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(Sort.by(direction, "firstName"));
	}

}
