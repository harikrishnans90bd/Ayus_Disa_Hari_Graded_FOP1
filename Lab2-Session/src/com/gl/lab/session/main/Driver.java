package com.gl.lab.session.main;

import com.gl.lab.session.admin.AdminDepartment;
import com.gl.lab.session.hr.HRDepartment;
import com.gl.lab.session.tech.TechDepartment;

public class Driver {

	public static void main(String[] args) {

		AdminDepartment department = new AdminDepartment();
		System.out.println(department.departmentName());
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(department.isTodayAHoliday());

		System.out.println("=================================");

		HRDepartment department2 = new HRDepartment();
		System.out.println(department2.departmentName());
		System.out.println(department2.isTodayAHoliday());
		System.out.println(department2.getTodaysWork());
		System.out.println(department2.getWorkDeadline());
		System.out.println(department2.isTodayAHolidaySuper());

		System.out.println("=================================");

		TechDepartment department3 = new TechDepartment();
		System.out.println(department3.departmentName());
		System.out.println(department3.getTodaysWork());
		System.out.println(department3.getWorkDeadline());
		System.out.println(department3.getTechStackInformation());
		System.out.println(department3.isTodayAHolidaySuper());

		System.out.println("=================================");
	}

}
