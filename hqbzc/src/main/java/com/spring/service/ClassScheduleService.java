package com.spring.service;

import java.util.List;

import com.spring.entity.ClassSchedule;

public interface ClassScheduleService {

	List<ClassSchedule> getClassSchedule(int page, String className);
}
