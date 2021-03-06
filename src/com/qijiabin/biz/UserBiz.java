package com.qijiabin.biz;

import java.util.List;

import com.qijiabin.entity.Userinfo;

public interface UserBiz {
	public void add(Userinfo u);
	public List<Userinfo> getAll();
	public void delete(Userinfo user);
	public Userinfo login(Userinfo user);
	public int update(Userinfo user);
	public List<Userinfo> getAll(final int curPage,final int pageSize);
	public long getTotalPages(int pageSize);
}
