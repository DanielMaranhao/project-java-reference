package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramSeller {

	public static void main(String[] args) {		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== TEST 2: seller findByDepartmentId ===");		
		List<Seller> list = sellerDao.findByDepartmentId(2);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== TEST 3: seller findAll ===");		
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Marcus", "marcus@gmail.com", new Date(), 4000.0, new Department(2, "Electronics"));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		System.out.println();
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Bob Brown");
		sellerDao.update(seller);
		System.out.println("Update completed");
		System.out.println();
		
		System.out.println("=== TEST 6: seller delete ===");
		sellerDao.deleteById(newSeller.getId());
		System.out.println("Delete Completed");
	}
}
