package com.bit2015.bit2015mall.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit2015.bit2015mall.service.AdminService;
import com.bit2015.bit2015mall.vo.AdminVo;
import com.bit2015.bit2015mall.vo.UserVo;

@Controller
@RequestMapping("/ad")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@RequestMapping( "" )
	public String admin(Long no, AdminVo adminVo, UserVo userVo) {
		System.out.println(adminVo);
		System.out.println(userVo);
		System.out.println(no);
		/*if(adminVo.getNo() == 0){
			System.out.println(session);
			System.out.println("ad user" + no);
			return "redirect:/";
		}else{
			System.out.println("aa");
		}*/
		//UserVo vo = userService.member_modify_view(no);
		
		return "admin/login";
	}
	
	//회원관리
	@RequestMapping("/member")
	public String member(Model model, String no){
		System.out.println(no);
			List<AdminVo> list = adminService.getList();
			model.addAttribute("list", list);
		return "admin/member";
	}
	
	//상품관리
	@RequestMapping("/product")
	public String product(){
		return "admin/product";
	}
	
	//상품등록
	@RequestMapping("/product_new")
	public String product_new(){
		return "admin/product_new";
	}
	
	//주문관리
	@RequestMapping("/jumun")
	public String jumun(){
		return "admin/jumun";
	}
	
	//옵션관리
	@RequestMapping("/opt")
	public String opt(){
		return "admin/opt";
	}
	
	//FAQ관리
	@RequestMapping("/faq")
	public String faq(){
		return "admin/faq";
	}
	
}
