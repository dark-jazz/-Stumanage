package com.offcn;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	private List<String> excuteMappingURL;
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String url=req.getRequestURI();
		if(url!=null&&url!=""){
			int index=url.lastIndexOf(".");
			if(index>-1){
				String postfix=url.substring(index);
				if(postfix!=""&&postfix!=null&&excuteMappingURL.contains(postfix)){
					return true;
				}else{return false;}
			}else{
				if(!url.contains("login")){
					HttpSession session=req.getSession();
					if(session.getAttribute("user")==null){
						req.getRequestDispatcher("/login.jsp").forward(req, res);
					}
				}
			}
		}
		return true;
	}

	public List<String> getExcuteMappingURL() {
		return excuteMappingURL;
	}

	public void setExcuteMappingURL(List<String> excuteMappingURL) {
		this.excuteMappingURL = excuteMappingURL;
	}
	
	

}
