package com.bit2015.bit2015mall.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2015.bit2015mall.service.UserService;
import com.bit2015.bit2015mall.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping( "/member_agree" )
	public String member_agree() {
		return "user/member_agree";
	}

	@RequestMapping( "/member_join" )
	public String member_join() {
		return "user/member_join";
	}

	@RequestMapping( "/member_joinend" )
	public String member_joinend(@ModelAttribute UserVo userVo, String password1, String password2,
			String tel1, String tel2, String tel3, String phone1, String phone2, String phone3,
			String zip1, String zip2, String juso,
			String birthday1, String birthday2, String birthday3) {
		//System.out.println(password1 + ":" + password2);
		
		if(password1.equals(password2)){
			userVo.setType("회원");
			userVo.setPhone_number(tel1+ "-" + tel2 + "-" + tel3);
			userVo.setHandphone(phone1+ "-" + phone2 + "-" + phone3);
			userVo.setBirthday(birthday1 + "-" + birthday2 + "-" + birthday3);
			userVo.setPassword(password1);
			System.out.println(userVo);
			userService.member_join(userVo);
			
			return "user/member_joinend";
		}else{
			return "user/member_join";
			
		}
	}
	
	@RequestMapping("/member_login")
	public String member_login() {
		return "user/member_login";
	}
	
	@RequestMapping("member_loginok")
	public String member_loginok(HttpSession session, @ModelAttribute UserVo userVo ) {
		System.out.println(userVo);
		
		UserVo vo = userService.login(userVo);
		if( vo == null ) {
			return "redirect:/user/loginform";
		}
		
		// 로긴처리
		session.setAttribute( "authUser", vo );
		return "redirect:/";
	}
	
	@RequestMapping("/member_logout")
	public String member_logout(HttpSession session) {
		//session = session.getSession();
		if(session == null){
			return "redirect:/";
		}
		
		//로그아웃처리
		session.removeAttribute("authUser");
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	@RequestMapping("/member_modify/{no}")
	public String member_modify(@PathVariable("no") long no, Model model) {
		UserVo vo = userService.member_modify_view(no);
		System.out.println(vo);
		System.out.println(vo.getHandphone());
		
		String handphone = vo.getHandphone();
		String[] array_handphone = handphone.split("-");
		String phone1 = array_handphone[0];
		String phone2 = array_handphone[1];
		String phone3 = array_handphone[2];

		String phone_number = vo.getPhone_number();
		String[] array_phone_number = phone_number.split("-");
		String tel1 = array_phone_number[0];
		String tel2 = array_phone_number[1];
		String tel3 = array_phone_number[2];
		
		String birthday = vo.getBirthday();
		String[] array_birthday = birthday.split("-");
		String birthday1 = array_birthday[0];
		String birthday2 = array_birthday[1];
		String birthday3 = array_birthday[2];
		
		System.out.println(phone1 +phone2 +phone2 );
		System.out.println(tel1 +tel2 +tel3 );
		System.out.println(birthday1 +birthday2 +birthday3 );
		
		
		vo.getHandphone();
		
		model.addAttribute("vo",vo);
		model.addAttribute("phone1",phone1);
		model.addAttribute("phone2",phone2);
		model.addAttribute("phone3",phone3);
		model.addAttribute("tel1",tel1);
		model.addAttribute("tel2",tel2);
		model.addAttribute("tel3",tel3);
		model.addAttribute("birthday1",birthday1);
		model.addAttribute("birthday2",birthday2);
		model.addAttribute("birthday3",birthday3);
			
			/*UserVo vo = userService.member_modify_view();*/
		
		return "user/member_modify";
	}
	
	
	@RequestMapping("/member_modifying/{no}")
	public String member_modifying(@PathVariable("no") long no, @ModelAttribute UserVo userVo, String password1, String password2,
			String tel1, String tel2, String tel3, String phone1, String phone2, String phone3,
			String zip1, String zip2, String juso,
			String birthday1, String birthday2, String birthday3) {

			userVo.setPhone_number(tel1+ "-" + tel2 + "-" + tel3);
			userVo.setHandphone(phone1+ "-" + phone2 + "-" + phone3);
			userVo.setBirthday(birthday1 + "-" + birthday2 + "-" + birthday3);
			userVo.setPassword(password1);
			userVo.setNo(no);
			//userVo.setType("회원");
			System.out.println(userVo);
			userService.member_update(userVo);
			
		return "user/member_modifying";
	}
	
	

	
	
/*	
	@RequestMapping( "/login" )
	public String login( HttpSession session, @ModelAttribute UserVo userVo ) {
		UserVo vo = userService.login( userVo );
		if( vo == null ) {
			return "redirect:/user/loginform";
		}
		
		// 로긴처리
		session.setAttribute( "authUser", vo );
		return "redirect:/";
	}	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//session = session.getSession();
		if(session == null){
			return "redirect:/";
		}
		
		//로그아웃처리
		session.removeAttribute("authUser");
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	@RequestMapping( "/join" )
	public String join( @ModelAttribute UserVo userVo ) {
		userService.join( userVo );
		return "redirect:/user/joinsuccess";
		//return "user/joinsuccess";
	}
	
	@RequestMapping("/modifyform")
	public String updateform() {
		
		return "user/modifyform";
	}
	
	@RequestMapping("/modify")
	public String modifyform(@ModelAttribute UserVo userVo, String repassword) {
		System.out.println("UserController:" + userVo);
		System.out.println(repassword);
		userVo.setPassword(repassword);
		
		userService.update(userVo);
		return "redirect:/user/modifysuccess";
	}
	
	@RequestMapping("/modifysuccess")
	public String modifysuccess() {
		
		return "user/modifysuccess";
	}

	@RequestMapping("/checkemail")
	@ResponseBody
	public Object checkemail(String email) {
		UserVo userVo = null;
		System.out.println("checkemail : " + email);
		userVo = userService.checkemail(email);
		
		Map<String, String> map = new HashMap<String, String>();
		
		if(userVo == null){
			map.put("result", "not exist");
		}else {
			map.put("result", "exist");
		}
		//System.out.println(map);
		return map;
	}
	*/
	
	
	@RequestMapping("/cart")
	public String cart(){
		return "cart";
	}
	
	@RequestMapping("/jumun")
	public String jumum(){
		return "jumun";
	}
	
	
	@RequestMapping("/order")
	public String order(){
		return "order";
	}
}