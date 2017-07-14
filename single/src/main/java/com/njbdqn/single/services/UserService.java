//package com.njbdqn.single.services;
//
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.njbdqn.single.componse.page.PageBean;
//import com.njbdqn.single.componse.page.PageInParam;
//import com.njbdqn.single.dao.BanksDAO;
//import com.njbdqn.single.dao.UserinfosDAO;
//import com.njbdqn.single.vo.Bankcards;
//import com.njbdqn.single.vo.Userinfos;
//
//@Service
//@Transactional
//public class UserService {
//	@Autowired
//	private UserinfosDAO udao;
//	@Autowired
//	private BanksDAO bdao;
//	public void openAccount(Userinfos user,Bankcards card){
//		udao.saveUser(user);
//		card.setUserid(user.getUserid());
//		bdao.saveCard(card);
//	}
//	public void destAccount(int userid){
//		udao.delUser(userid);
//	}
//	public PageBean<Userinfos> findBean(PageInParam pip){
//		PageBean<Userinfos> pb = new PageBean<Userinfos>(udao);
//		pb.setPip(pip);
//		return pb.findBean();
//	}
//	public List<Bankcards> findCardByUserid(int userid){
//		return bdao.findCardsByUser(userid);
//	}
//	public synchronized String getNewFileName(String oldName){
//		return new Date().getTime()+oldName.substring(oldName.lastIndexOf("."));
//	}
//}
