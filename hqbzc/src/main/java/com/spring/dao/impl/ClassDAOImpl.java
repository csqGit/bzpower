package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.ClassDAO;
import com.spring.entity.ApplyClass;

@Repository
public class ClassDAOImpl implements ClassDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public int getCount() {
		Session session = sessionFactory.openSession();
		String hql = "select count(*) from ApplyClass";
		Object res = 0;
		int count = 0;
		try {
			Query query = session.createQuery(hql);
			res = query.uniqueResult();
			count = Integer.parseInt("" + res);
		} catch (Exception e) {
			e.printStackTrace();
			return count;
		}
		return count;
	}

}
