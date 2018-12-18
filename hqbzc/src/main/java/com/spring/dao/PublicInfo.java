package com.spring.dao;

import java.util.List;
/**
 * E 为传入类型，PK为主键，如id
 * @author Admin
 *
 * @param <E>
 * @param <PK>
 */
public interface PublicInfo<E, PK> {
	
	public List<E> getInfo(E e);
}
