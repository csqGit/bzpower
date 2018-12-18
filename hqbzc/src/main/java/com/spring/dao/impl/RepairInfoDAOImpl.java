package com.spring.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.RepairInfoDAO;
import com.spring.entity.RepairInfo;

/**
 * 
 * @author Admin
 *
 */
@Repository
public class RepairInfoDAOImpl implements RepairInfoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<RepairInfo> getRepairInfo(int first, int maxResult) {
		Session session = sessionFactory.openSession();
		String hql = "from RepairInfo";
		List<RepairInfo> list = null;
		try {
			Query query = session.createQuery(hql);
			query.setFirstResult(first);
			query.setMaxResults(maxResult);
			list = query.list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}

	public int getCount() {
		Session session = sessionFactory.openSession();
		String hql = "select count(*) from RepairInfo";
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

	public boolean saveRepairInfo(RepairInfo repairInfo) {
		Session session = sessionFactory.openSession();
		try {
			session.save(repairInfo);
			session.beginTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
		return true;
	}

}
