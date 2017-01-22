package web;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CourseBean {
	
	private List<Course> trimester = new ArrayList<Course>();
	private Map<Integer, List<Course>> tri = new LinkedHashMap<Integer, List<Course>>();

	public Map<Integer, List<Course>> getTri() {
		return tri;
	}


	public List<Course> getTrimester() {
		return trimester;
	}

	public CourseBean(){
		trimester.add(new Course("Espanol I", "AHQ101", 4,0,new String[] {""},0));
		trimester.add(new Course("Matematicas", "CBM101", 5,0,new String[] {""},0));
		trimester.add(new Course("Programacion", "IDS101", 5,0,new String[] {""},0));
		tri.put(1, trimester);
		trimester = new ArrayList<Course>();
		trimester.add(new Course("Espanol II", "AHQ102", 4,0,new String[] {"AHQ101"},0));
		trimester.add(new Course("Matematicas II", "CBM102", 5,0,new String[] {"CBM101"},0));
		trimester.add(new Course("Programacion II", "IDS102", 5,0,new String[] {"IDS101"},0));
		tri.put(2, trimester);
	}
}
