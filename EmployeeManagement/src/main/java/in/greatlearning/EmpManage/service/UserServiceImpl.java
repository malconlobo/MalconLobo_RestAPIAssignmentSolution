package in.greatlearning.EmpManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.greatlearning.EmpManage.entities.User;
import in.greatlearning.EmpManage.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);		
	}

}
