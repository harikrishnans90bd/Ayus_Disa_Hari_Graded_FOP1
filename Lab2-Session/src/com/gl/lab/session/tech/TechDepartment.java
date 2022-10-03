package com.gl.lab.session.tech;

import com.gl.lab.session.base.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		return "Welcome to Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

	public String isTodayAHolidaySuper() {
		return super.isTodayAHoliday();
	}
}