package com.greatlearning.customerRelationshipManagement.service;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.customerRelationshipManagement.entity.Customer;


@Repository
public class CustomerServiceImpl implements CustomerService {



private SessionFactory sessionFactory;
	
	private Session session;

	private Customer Customer;
	
	@Autowired
	CustomerServiceImpl(SessionFactory sessionFactory)
	{
		this.setSessionFactory(sessionFactory);
		try {
			session = sessionFactory.getCurrentSession();
		}
		catch(HibernateException e) {
			session = sessionFactory.openSession();
			
			
		}
	}

	@Transactional
	public List<Customer> findAll(){
		
		Transaction tx = session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Customer> customers = session.createQuery("from Customer").list();
		
		tx.commit();
		
		return customers;
		
	}

	public Customer findById (int Id) {
		
		Transaction tx = session.beginTransaction();
		
		Customer = session.get(Customer.class, Id);
		
		tx.commit();
		
		return Customer;
		
	}

	public void save(Customer customer) {
		
		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(Customer);
		
		tx.commit();
		
	}
    
	
	
	public void deleteById(int Id) {
		

		Transaction tx = session.beginTransaction();
		

		Customer customer = session.get(Customer.class, Id);
		
		session.delete(customer);
		
		tx.commit();
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<com.greatlearning.customerRelationshipManagement.entity.Customer> findByAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
	
	
	
	
	
	
	
	
	
