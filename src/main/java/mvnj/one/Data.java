package mvnj.one;

import java.util.ArrayList;

public class Data {
	static ArrayList<ArrayList<ProbeCourseList>> Trimester;
	
	static ProbeCourseList mat1= new ProbeCourseList();
	static ProbeCourseList mat2= new ProbeCourseList();
	static ProbeCourseList mat3= new ProbeCourseList();
	 static ProbeCourseList mat4= new ProbeCourseList();
	 static ProbeCourseList mat5= new ProbeCourseList();
	
	 static ProbeCourseList mat6= new ProbeCourseList();
	 static ProbeCourseList mat7= new ProbeCourseList();
	 static ProbeCourseList mat8= new ProbeCourseList();
	 static ProbeCourseList mat9= new ProbeCourseList();
	 static ProbeCourseList mat0= new ProbeCourseList();
	public void Cdata() {
		// TODO Auto-generated method stub
		Trimester =  new ArrayList<ArrayList<ProbeCourseList>>();
		
		
		mat1.setCode("AHC101");
		mat1.setCredits(4);
		mat1.setName("COMUNICACIÓN EN LENGUA ESPAÑOLA I");
		mat1.setPreReq("-");
		mat1.setReqCredts(0);
		
		mat2.setCode("AHO101");
		mat2.setCredits(2);
		mat2.setName("ORIENTACIÓN ACADÉMICA E INSTITUCIONAL (1)");
		mat2.setPreReq("-");
		mat2.setReqCredts(0);
		
		mat3.setCode("CBM101");
		mat3.setCredits(5);
		mat3.setName("ÁLGEBRA Y GEOMETRÍA ANALÍTICA	");
		mat3.setPreReq("-");
		mat3.setReqCredts(0);
		
		mat4.setCode("---");
		mat4.setCredits(4);
		mat4.setName("Electiva");
		mat4.setPreReq("-");
		mat4.setReqCredts(0);
		
		mat5.setCode("---");
		mat5.setCredits(4);
		mat5.setName("ingles");
		mat5.setPreReq("-");
		mat5.setReqCredts(0);
		
		
		mat6.setCode("AHC102");
		mat6.setCredits(4);
		mat6.setName("COMUNICACIÓN EN LENGUA ESPAÑOLA II");
		mat6.setPreReq("-");
		mat6.setReqCredts(0);
		
		mat7.setCode("AHQ101");
		mat7.setCredits(4);
		mat7.setName("QUEHACER CIENTÍFICO");
		mat7.setPreReq("-");
		mat7.setReqCredts(0);
		
		mat8.setCode("CBM102");
		mat8.setCredits(5);
		mat8.setName("CÁLCULO DIFERENCIAL");
		mat8.setPreReq("-");
		mat8.setReqCredts(0);
		
		mat9.setCode("---");
		mat9.setCredits(2);
		mat9.setName("Electiva");
		mat9.setPreReq("-");
		mat9.setReqCredts(0);
		
		mat0.setCode("---");
		mat0.setCredits(4);
		mat0.setName("Ingles 2");
		mat0.setPreReq("-");
		mat0.setReqCredts(0);
		
	}
}
