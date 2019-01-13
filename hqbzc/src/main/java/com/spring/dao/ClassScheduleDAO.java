package com.spring.dao;

import java.util.List;

import com.spring.entity.ClassSchedule;

public interface ClassScheduleDAO {

	List<ClassSchedule> getClassSchedule(int page, int maxPage, String className);
}
