package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.GoodLostDAO;
import com.spring.entity.GoodLost;

@Repository
public class GoodLostDAOImpl implements GoodLostDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public List<GoodLost> getGoodList(int startPosition, int maxResult, String type, String name) {
		Session session = sessionFactory.openSession();
		StringBuffer hql = new StringBuffer("from GoodLost");
		if(type != null) {
			hql = hql.append(" where type = " + type);
		}else if(name != null){
			hql = hql.append(" where type = " + name);
		}
		List<GoodLost> list = null;
		try {
		Query query = session.createQuery(hql.toString());
		query.setFirstResult(startPosition);
		query.setMaxResults(maxResult);
		list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	

	@SuppressWarnings("unchecked")
	public int getCount() {
		Session session = sessionFactory.openSession();
		String hql = "from GoodLost";
		List<GoodLost> list = null;
		try {
			list = session.createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list.size();
	}

}
