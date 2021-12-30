package in.greatlearning.EmpManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.greatlearning.EmpManage.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User getByUsername(String username);
	
}
