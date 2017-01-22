package web;

public class Course {
	
	private String name;
	private String code;
	private int credits;
	private int coreq;
	private String[] prereq;
	private int crdreq;
	
	public Course(String name, String code, int credits, int cor,String[] prer,int crd) {
		this.name = name;
		this.code = code;
		this.credits = credits;
		this.coreq =cor;
		this.prereq =prer;
		this.crdreq = crd;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCoreq() {
		return coreq;
	}

	public int getCrdreq() {
		return crdreq;
	}

	public void setCoreq(int coreq) {
		this.coreq = coreq;
	}

	public void setCrdreq(int crdreq) {
		this.crdreq = crdreq;
	}

	public String[] getPrereq() {
		return prereq;
	}

	public void setPrereq(String[] prereq) {
		this.prereq = prereq;
	}
	

}
