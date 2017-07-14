//package com.njbdqn.single.controller;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.web.bind.ServletRequestDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.njbdqn.single.componse.page.PageInParam;
//import com.njbdqn.single.services.UserService;
//import com.njbdqn.single.vo.Bankcards;
//import com.njbdqn.single.vo.Userinfos;
//
//@Controller
//public class InitController {
//	@Autowired
//	private UserService uService;
//	@InitBinder
//	public void dateBind(ServletRequestDataBinder bind){
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		df.setLenient(true);
//		bind.registerCustomEditor(Date.class,new CustomDateEditor(df,true));
//	}
//	@RequestMapping("/init.do")
//	public String init(@RequestParam(required=false) PageInParam pip,HttpServletRequest request){
//		request.setAttribute("pb", uService.findBean(pip));
//		return "index";
//	}
//	@RequestMapping("/save.do")
//	@ResponseBody
//	public Userinfos saveUser(@RequestParam(value="file") MultipartFile file,Userinfos user,Bankcards card ,HttpSession session){
//		String path = session.getServletContext().getRealPath("/upload");
//		String newName=uService.getNewFileName(file.getOriginalFilename());
//		File serfile = new File(path,newName);
//		try {
//			file.transferTo(serfile);
//		} catch (IllegalStateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		user.setUserphoto(newName);
//		uService.openAccount(user, card);
//		return user;
//	}
//	@RequestMapping("/del.do")
//	public String del(int userid){
//		uService.destAccount(userid);
//	}
//	@RequestMapping("/findCard.do")
//	@ResponseBody
//	public List<Bankcards> findCard(int userid){
//		return uService.findCardByUserid(userid);
//	}
//}
