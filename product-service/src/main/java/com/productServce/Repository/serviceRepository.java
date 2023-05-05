package com.productServce.Repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.productServce.entity.productEntity;


@Repository
public class serviceRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<productEntity>findAllUser() {
		try {
			String hqlQuery="from productEntity";
		Session session= sessionFactory.openSession();
		  Query query = session.createQuery(hqlQuery);
		   return query.getResultList();
		
		
	}catch(Exception e) {
		
	}
	
	}

	public void saveUser(productEntity productEntity) {
		
		try {
		      Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(productEntity);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
