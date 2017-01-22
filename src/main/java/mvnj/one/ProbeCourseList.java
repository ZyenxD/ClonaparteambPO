package mvnj.one;

public class ProbeCourseList {
	String code,Name,PreReq;
	int Credits,ReqCredts;
	
	public ProbeCourseList(String code, String name, String preReq,
			int credits, int reqCredts) {
		this.code = code;
		Name = name;
		PreReq = preReq;
		Credits = credits;
		ReqCredts = reqCredts;
	}	
}
