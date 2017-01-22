package com.pensumorganizer.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PRBean {
	
	private Map<Integer, List<Course>> tri = new LinkedHashMap<Integer,List<Course>>();
	private PensumReorganizer pensumOrg = new PensumReorganizer();
	private static TrialDataSetter TRD = new TrialDataSetter();
	private PriorityQueue<Course> PQ;

	public Map<Integer, List<Course>> getTri() {
		return tri;
	}

	public PRBean() {
		TRD.setData();
		this.PQ = pensumOrg.prioritizeCourses();
		this.tri = pensumOrg.reorganizePensum(PQ); 
	}
	
	

}
