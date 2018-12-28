package com.system.xianbozhan.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.LineDAO;
import com.system.xianbozhan.entity.Line;
import com.system.xianbozhan.entity.LineName;
import com.system.xianbozhan.service.LineService;

@Service
public class LineServiceImpl implements LineService{
	public static int current = 10;
	
	@Autowired
	private LineDAO lineDAO;

	public List<Line> getLineList(int startPage) {
		int start = (startPage - 1) * current;
		return lineDAO.getLineList(start, current);
	}
	
	public Set<LineName> getLineName() {
		List<Line> list = lineDAO.getLineName();
		Set<LineName> lineNameList = new HashSet<LineName>();
		for(Line l : list) {
			LineName lineName = new LineName();
			lineName.setId(l.getId());
			lineName.setLineName(l.getLineName());
			lineNameList.add(lineName);
		}
		return lineNameList;
	}

	public Line getLineById(int id) {
		// TODO Auto-generated method stub
		return lineDAO.getLineById(id);
	}

	public List<Line> getLineBylineNameAndOther(String companyName, String lineName, String voltageGrade) {
		// TODO Auto-generated method stub
		return lineDAO.getLineBylineNameAndOther(companyName, lineName, voltageGrade);
	}

	public void addLine(Line line) {
		// TODO Auto-generated method stub
		lineDAO.addLine(line);
	}

	public void updateLine(Line line) {
		// TODO Auto-generated method stub
		lineDAO.updateLine(line);
	}

	public void deleteLine(int id) {
		// TODO Auto-generated method stub
		lineDAO.deleteLine(id);
	}

	public int getCount() {
		int count = lineDAO.getCount().size();
		return count;
	}

	public int getPages() {
		int count = getCount();
		int pages = count / current;
		if(count % current != 0)
			pages ++;
		return pages;
	}



}
