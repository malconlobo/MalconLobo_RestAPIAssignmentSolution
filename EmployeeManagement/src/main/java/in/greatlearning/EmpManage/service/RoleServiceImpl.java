package in.greatlearning.EmpManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.greatlearning.EmpManage.entities.Role;
import in.greatlearning.EmpManage.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);
	}

}
