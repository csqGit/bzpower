package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.NewInfoDAO;
import com.spring.entity.NewInfo;
import com.spring.entity.NewType;

@Repository
public class NewInfoDAOImpl implements NewInfoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@SuppressWarnings("unchecked")
	public List<NewInfo> getNewInfoList(int startPosition, String type) {
		Session session = sessionFactory.openSession();
		String hql = "from NewInfo where type = " + type;
		List<NewInfo> list = null;
		try {
			list = session.createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}


	public List<NewType> getNewTypeList() {
		Session session = sessionFactory.openSession();
		String hql = "from NewType";
		List<NewType> list = null;
		try {
			list = session.createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}


	public List<NewInfo> getNewInfoList(int startPosition, int maxResult) {
		Session session = sessionFactory.openSession();
		String hql = "from NewInfo" ;
		
		List<NewInfo> list = null;
		try {
			Query query = session.createQuery(hql);
			query.setFirstResult(startPosition);
			query.setMaxResults(maxResult);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}


	public int getCount() {
		Session session = sessionFactory.openSession();
		String hql = "from NewInfo" ;
		int count = 0;
		try {
			Query query = session.createQuery(hql);
			List list = query.list();
			if(list.size() > 0)
				count = list.size();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return count;
		}
		return count;
	}

}
