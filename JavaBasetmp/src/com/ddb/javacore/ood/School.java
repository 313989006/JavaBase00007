package com.ddb.javacore.ood;

import com.sun.webkit.ContextMenu.ShowContext;

public class School {
	String schoolName;
	int classNumber;
	int labNumber;

	public void showCenter() {
		System.out.println(schoolName + "培训学院\n" + "配备 : " + classNumber + "教" + labNumber + "机");
	}
	}
