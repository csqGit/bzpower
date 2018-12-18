package com.spring.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.StudentDAO;
import com.spring.entity.NewInfo;

@Repository
public class StudentDAOImpl implements StudentDAO{
	@Autowired
	private SessionFactory sessionFactory;

	//得到新闻信息
	public List<NewInfo> getAll(int page, int maxResult) {
		Session session = sessionFactory.openSession();
		List<NewInfo> list = new ArrayList<NewInfo>();
		String hql = "from NewInfo";
		try {
			Query query = session.createQuery(hql);
			query.setFirstResult(page);
			query.setMaxResults(maxResult);
			list = query.list();
			System.out.println(list);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return list;
	}

	public int getCount() {
		Session session = sessionFactory.openSession();
		String hql = "select count(*) from NewInfo";
		int count = 0;
		try {
			Query query = session.createQuery(hql);
			Object obj = query.uniqueResult();
			count = Integer.parseInt(obj + "");
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		return count;
	}
	
}
