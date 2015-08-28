package com.hand.action;

import com.opensymphony.xwork2.ActionSupport;

public class SalaryAction extends ActionSupport {

	public String add() throws Exception {
		System.out.println("加工资");
		return SUCCESS;
	}
	public String show() throws Exception {
		System.out.println("查看工资");
		return SUCCESS;
	}
	public String update() throws Exception {
		System.out.println("修改工资");
		return SUCCESS;
	}
	public String delete() throws Exception {
		System.out.println("开除了");
		return SUCCESS;
	}
}
