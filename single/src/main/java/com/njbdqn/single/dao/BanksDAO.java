package com.njbdqn.single.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.njbdqn.single.vo.Bankcards;

public interface BanksDAO {
	@Insert("insert into bankcards values(seq_cardid.nextval,#{userid},#{balance}")
	public void saveCard(Bankcards card);
	@Select("select * from bankcards where userid=#{userid}")
	public List<Bankcards> findCardsByUser(int userid);
}
