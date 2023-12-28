package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.model.Employee;
import com.web.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/addEmployee")
	public String addingForm()
	{
		return "addEmployee";
	}
	@RequestMapping("/register")
	public String response(Employee emp)
	{
		Employee e=service.saveEmployee(emp);
		return "success";
	}
	@RequestMapping("/viewEmployee")
	public String viewAllEmployees(ModelMap model)
	{
		model.put("emps", service.getAllEmployees());
		return "viewEmployee";
	}
	@RequestMapping("/delete/{eid}")
	public String delete(@PathVariable int eid)
	{
		service.deleteEmployee(eid);
		return "redirect:/viewEmployee";
	}
	@RequestMapping("/update/{eid}")
	public String update(ModelMap model,@PathVariable int eid)
	{
		model.put("command",service.getEmployee(eid));
		return "editEmployee";
	}
	@RequestMapping(value="/edite",method=RequestMethod.GET)
	public String updateAndSave(Employee emp,int eid)
	{
		service.updateEmployee(emp, eid);
		return "redirect:/viewEmployee";
	}

}
