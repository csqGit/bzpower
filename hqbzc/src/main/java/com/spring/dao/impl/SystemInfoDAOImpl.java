package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.SystemInfoDAO;
import com.spring.entity.ApplyClass;
import com.spring.entity.FreeClass;
import com.spring.entity.InterIdea;
import com.spring.entity.PictureInfo;
import com.spring.entity.SystemInfo;

@Repository
public class SystemInfoDAOImpl implements SystemInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private int[] arr = new int[0];

	/*
	 * 定义公共查询类，查询
	 */
	public List<?> getInfo(Object obj, int[] page) {
		Session session = sessionFactory.openSession();
		String objName = obj.getClass().getName();
		objName = objName.substring(objName.lastIndexOf(".") + 1);
		String hql = "from " + objName;
		List<SystemInfo> list = null;
		Query query = session.createQuery(hql);
		int start = 0;
		int maxResults = 10;
		if (page.length > 0) {
			start = page[0];
			maxResults = page[1];
			query.setFirstResult(start);
			query.setMaxResults(maxResults);
		}
		try {
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}

	public List<SystemInfo> getSystemInfo(SystemInfo systemInfo) {
		List<SystemInfo> list = (List<SystemInfo>) getInfo(systemInfo, arr);
		return list;
	}

	public List<InterIdea> getInterIdea(InterIdea interIdea) {
		List<InterIdea> list = (List<InterIdea>) getInfo(interIdea, arr);
		return list;
	}

	public List<PictureInfo> getPicUrl(PictureInfo pictureInfo) {
		@SuppressWarnings("unchecked")
		List<PictureInfo> list = (List<PictureInfo>) getInfo(pictureInfo, arr);
		return list;
	}

	public void savePicInfo(PictureInfo pictureInfo) {
		Session session = sessionFactory.openSession();
		try {
			session.save(pictureInfo);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			session.close();
		}
	}

	public boolean saveApplyClass(ApplyClass applyClass) {
		Session session = sessionFactory.openSession();
		try {
			session.save(applyClass);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	public List<ApplyClass> getApplyClass(ApplyClass applyClass) {
		List<ApplyClass> list = (List<ApplyClass>) getInfo(applyClass, arr);
		return list;
	}

	public List<FreeClass> getFreeClass(int start, int maxResult, int classId) {
		Session session = sessionFactory.openSession();
		String hql = "from FreeClass where classId = " + classId;
		List<FreeClass> list = null;
		try {
			Query query = session.createQuery(hql);
			query.setFirstResult(start);
			query.setMaxResults(maxResult);
			list = query.list();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}

	/*
	 * 通用信息查询
	 */

}
