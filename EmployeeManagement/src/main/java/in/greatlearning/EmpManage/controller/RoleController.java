package in.greatlearning.EmpManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.greatlearning.EmpManage.entities.Role;
import in.greatlearning.EmpManage.service.RoleService;

@RestController
@RequestMapping("/rolecontroller")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@PostMapping("/role")
	public void save(@RequestBody Role role) {
		roleService.save(role);
	}
	
}
