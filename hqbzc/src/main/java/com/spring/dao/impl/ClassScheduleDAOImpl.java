package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.ClassScheduleDAO;
import com.spring.entity.ClassSchedule;

@Repository
public class ClassScheduleDAOImpl implements ClassScheduleDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<ClassSchedule> getClassSchedule(int page,int maxPage, String className) {
		String hql = "from ClassSchedule where className like '" + className + "%'";
		List<ClassSchedule> list = null;
		try {
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hql);
			//query.setParameter(0, className);
			query.setFirstResult(page);
			query.setMaxResults(maxPage);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}

}
