package jweb.p.a103.model;

public class Department {

	private String dept_id, dept_name,description;

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 */
	public Department() {
	}
	

	/**
	 * @param dept_id
	 * @param dept_name
	 * @param description
	 */
	public Department(String dept_id, String dept_name, String description) {
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.description = description;
	}

}
