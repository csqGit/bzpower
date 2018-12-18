package com.htglxt.service;

import com.htglxt.entity.PictureInfo;

public interface SystemService {
	/**
	 * 文件上传
	 * @param filaName
	 * @return
	 */
	public void addUploadUrl(PictureInfo pictureInfo);
	
	/**
	 * 得到地址
	 */
	public PictureInfo getById(int id);

}
