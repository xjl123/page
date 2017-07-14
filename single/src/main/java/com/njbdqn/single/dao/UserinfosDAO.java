package com.njbdqn.single.dao;

import org.apache.ibatis.annotations.Delete;

import com.njbdqn.single.componse.page.IPageDAO;
import com.njbdqn.single.vo.Userinfos;

public interface UserinfosDAO extends IPageDAO<Userinfos>{
	
	public void saveUser(Userinfos user);
	@Delete("delete from userinfos where userid=#{userid}")
	public void delUser(int userid);
	
}
