package com.udemy.location.util;

import java.util.List;

public interface ReportUtil {
	void generatePieChart(String path, List<Object[]> data); // path = where final JPEG to live in and the entire path
																// to the JPEG will be passed in from the controller

}