package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(1);		
		System.out.println(department);
		System.out.println();
		
		System.out.println("=== TEST 2: department findAll ===");		
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "Silverware");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		System.out.println();
		
		System.out.println("=== TEST 4: department update ===");
		department = departmentDao.findById(1);
		department.setName("Computers");
		departmentDao.update(department);
		System.out.println("Update completed");
		System.out.println();
		
		System.out.println("=== TEST 5: department delete ===");
		departmentDao.deleteById(newDepartment.getId());
		System.out.println("Delete Completed");
	}
}
