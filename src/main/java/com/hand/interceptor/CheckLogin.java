package com.hand.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CheckLogin implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation invocation) throws Exception {
		String url;
		if(ServletActionContext.getRequest().getSession().getAttribute("username")!=null){
			url = invocation.invoke();
		}else{
			url = "loginfail";
		}
		return url;
	}

}
