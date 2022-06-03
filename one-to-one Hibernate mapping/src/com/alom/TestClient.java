package com.alom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.alom.entities.Address;
import com.alom.entities.Employee;

public class TestClient {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory sf = cfg.buildSessionFactory();
		 
		 //Adding Address
		 Address a = new Address();
		 a.setAddressId(100);
		 a.setCity("Pune");
		 a.setZip("411011");
		 
		 
		 Employee emp = new Employee();
		 emp.setEmpId(101);
		 emp.setEmpName("Sazzad");
		 emp.setEmpSal(333652.25);
		 emp.setAddress(a);
		 a.setEmployee(emp);
		 
		 Session s = sf.openSession();
		 Transaction t = s.beginTransaction();
		 s.save(emp);
		 t.commit();
		 s.close();

	}

}
