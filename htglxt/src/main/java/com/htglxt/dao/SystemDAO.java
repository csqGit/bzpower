package com.htglxt.dao;


import com.htglxt.entity.PictureInfo;

public interface SystemDAO {
	
	public void addUploadUrl(PictureInfo picture);
	
	public PictureInfo getById(int id);

}
