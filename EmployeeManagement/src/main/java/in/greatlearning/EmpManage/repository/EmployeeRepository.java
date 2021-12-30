package in.greatlearning.EmpManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.greatlearning.EmpManage.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
