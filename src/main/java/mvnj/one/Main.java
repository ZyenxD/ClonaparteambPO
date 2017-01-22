package mvnj.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.NamedEvent;

@ManagedBean
@ApplicationScoped
public class Main {

	private List<ProbeCourseList> courses = new ArrayList<>();
	
	public List<ProbeCourseList> getList (){
		init();
		return courses;
	}

	public void init(){
		ProbeCourseList mat1= new ProbeCourseList("AHC101","COMUNICACIÓN EN LENGUA ESPAÑOLA I","-",4,3);
		ProbeCourseList mat2= new ProbeCourseList("AHC101","COMUNICACIÓN EN LENGUA ESPAÑOLA I","-",4,3);
		ProbeCourseList mat3= new ProbeCourseList("AHC101","COMUNICACIÓN EN LENGUA ESPAÑOLA I","-",4,3);
		ProbeCourseList mat4= new ProbeCourseList("AHC101","COMUNICACIÓN EN LENGUA ESPAÑOLA I","-",4,3);
		ProbeCourseList mat5= new ProbeCourseList("AHC101","COMUNICACIÓN EN LENGUA ESPAÑOLA I","-",4,3);
		
		courses.add(mat1);
		courses.add(mat2);
		courses.add(mat3);
		courses.add(mat4);
		courses.add(mat5);
	}

}
