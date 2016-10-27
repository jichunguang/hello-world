package jcg.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jcg.bean.TbUser;

import jcg.service.TbUserServiceImpl;

@Controller
public class TbUserController {
	// ˽���û���TbUser
	private TbUserServiceImpl tbUserServiceImpl;

	public TbUserServiceImpl getTbUserServiceImpl() {
		return tbUserServiceImpl;
	}

	public void setTbUserServiceImpl(TbUserServiceImpl tbUserServiceImpl) {
		this.tbUserServiceImpl = tbUserServiceImpl;
	}

	// ��½����
	@RequestMapping("/login")
	public String login(TbUser tbUser, ModelMap modelMap,
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, 
			String certCode1) {

		Cookie cookie = new Cookie("remeber", tbUser.getUsername());
		String checkbox = httpServletRequest.getParameter("checkbox");
		
		System.out.println("checkbox"+checkbox);
		if (checkbox != null && checkbox.equals("yes")) {

			cookie.setMaxAge(60 * 60);
		} else {
			cookie.setMaxAge(0);
		}
		// ���reponse����
		httpServletResponse.addCookie(cookie);

		// �ȵ���֤���ַ���
		String msg = null;

		String str = (String) httpServletRequest.getSession().getAttribute(
				"certCode");
		System.out.println("session����֤��"+str);
		System.out.println("�������֤��"+certCode1);
		if (str != null && certCode1 != null && str.equals(certCode1)) {

			TbUser tbUser1 = tbUserServiceImpl.login(tbUser);

			if (tbUser1 == null) {
				msg = "0";// �û������������
				modelMap.addAttribute("msg", msg);
				return "login";
			}

		} else {
			
			msg = "1";// ��֤������
			modelMap.addAttribute("msg", msg);
			return "login";
		}
		httpServletRequest.getSession().setAttribute("Tbuser", tbUser);
		return "ClassInfo";
	}
}
