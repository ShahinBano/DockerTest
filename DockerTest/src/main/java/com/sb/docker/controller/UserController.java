package com.sb.docker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.docker.payload.Address;
import com.sb.docker.payload.Employee;
import com.sb.docker.payload.PermanentAddress;
import com.sb.docker.payload.PresentAddress;



@RestController
public class UserController {

	@GetMapping("/")
	public Map<String,List<Employee>> getUserDetails(){
		
		PermanentAddress permanentAddress=new PermanentAddress("DoddaneKundi",
				"Whitefield","Hoskote","KA","India","560037");
		PermanentAddress permanentAddress1=new PermanentAddress("Gachhiboli",
				"Gachhiboli","Hyderabad","Telangana","India","170051");
		
		PresentAddress presentAddress=new PresentAddress("BTM","2nd Stage",
				"Telrath","KA","India","560049");
		PresentAddress presentAddress1=new PresentAddress("BTM","3nd Stage",
				"Kahalgaow","KA","India","560049");
		
		Address address=new Address(permanentAddress,presentAddress);
		Address address1=new Address(permanentAddress1,presentAddress1);
		
		List<Employee> employee=new ArrayList<>();
		
		employee.add(new Employee(101,"Subhash","IT",24000.00,address));
		employee.add(new Employee(102,"Sanjeev","HR",29000.00,address1));
		
		Map<String,List<Employee>> map=new HashMap<>();
		
		map.put("Employee", employee);
		return map;
	}
}
