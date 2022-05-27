package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao 
{	
	public static void testGetAllEmployees()
	{
		List<Employee> allEmployees=EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while(empIterator.hasNext())
		{
			Employee emp = empIterator.next();
			System.out.println(emp.getEmp_id()+" "+emp.getFirst_name()+" "+emp.getSalary());
		}		
	}
	
	public static void testGetEmployeeById()
	{
		Employee emp= EmployeeDao.getEmployeeById(126);
		System.out.println(emp.getEmp_id()+" "+emp.getFirst_name()+" "+emp.getSalary());
	}
	
	public static void testInsertEmployee()
	{
		Employee newemp= new Employee();
		newemp.setEmp_id(300);
		newemp.setFirst_name("Arjun");
		newemp.setLast_name("Batman");
		newemp.setEmail("arjun24@gmail.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newemp.setHire_date(newDate);
		newemp.setJob_id("IT_PROG");
		newemp.setSalary(353535);
		
		int result = EmployeeDao.insertEmployee(newemp);
		System.out.println(result);	
	}	
	public static void testUpdateEmployee()
	{
		Employee oldemployee = EmployeeDao.getEmployeeById(126);
		System.out.println(oldemployee.getEmp_id()+" "+oldemployee.getFirst_name()+" "+oldemployee.getSalary());
		oldemployee.setFirst_name("Superman");
		oldemployee.setLast_name("Black Adam");
		oldemployee.setEmail("SuperBlack49@gmail.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		oldemployee.setHire_date(newDate);
		oldemployee.setJob_id("IT_PROG");
		oldemployee.setSalary(353535);
		
		int result = EmployeeDao.updateEmployee(oldemployee);
		System.out.println(result);
	}
	public static void testdeleteEmployee() 
	{
        int result=EmployeeDao.deleteEmployee(300);
        System.out.println(result + "rows deleted");
    }	
}