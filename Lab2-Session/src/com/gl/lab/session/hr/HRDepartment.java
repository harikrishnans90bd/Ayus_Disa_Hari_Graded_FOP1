package com.gl.lab.session.hr;

import com.gl.lab.session.base.SuperDepartment;

public class HRDepartment extends SuperDepartment {

	public String departmentName() {
		return "Welcome to HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String isTodayAHoliday() {
		return "team Lunch";
	}

	public String isTodayAHolidaySuper() {
		return super.isTodayAHoliday();
	}
}