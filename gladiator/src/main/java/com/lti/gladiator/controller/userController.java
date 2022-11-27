package com.lti.gladiator.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.gladiator.services.userService;
import com.lti.gladiator.services.userServiceImpl;
public class userController {
	@Autowired
	userServiceImpl userService;

}


//@CrossOrigin(origins="*")
//@RestController
//@RequestMapping("/emp")
//public class EmpController {
//	
//	@Autowired
//	EmpServiceImpl empService;
//	
//	//http://localhost:8282/emp/hello
//	@GetMapping("/hello")
//	public String hello() {
//		return "Hello";
//	}
//	
//	//http://localhost:8282/emp/findemp/101
//	@GetMapping("/findemp/{eid}")
//	public Employee findEmpById(@PathVariable("eid") int empNo) throws EmpException {
//		return empService.searchEmp(empNo);
//		
//	}
//	
//	//http://localhost:8282/emp/updatesal/101/52320
//	@GetMapping("/updatesal/{eid}/{sal}")
//	public Employee updateSal(@PathVariable("eid") int empNo,@PathVariable("sal") int empSal) throws EmpException {
//		return empService.updateSal(empNo,empSal);
//		
//	}
//	
//	//http://localhost:8282/emp/updatesalbyemployee/101
//	@PostMapping("/updatesalbyemployee/{eid}")
//	public Employee updateSalByEmployee(@PathVariable("eid") int empNo,@RequestBody Employee e) throws EmpException {
//		return empService.updateSalByEmployee(empNo,e);
//		
//	}
//	
//	//http://localhost:8282/emp/addemployee
//	@PostMapping("/addemployee")
//	public int addEmployee(@RequestBody Employee e) throws EmpException {
//		return empService.addEmployee(e);
//		
//	}
//	
//	//http://localhost:8282/emp/findemp
//	@GetMapping("/employees")
//	public List<Employee> findEmployee() throws EmpException {
//		return empService.getAllNames();
//	}
//	
//
//}
