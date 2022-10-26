package jweb.p.a103.model;

public class Personal {

	private String firstname, lastname,mobile,email,hobbies,description,nationality,gender;
	private int presonal_id;

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getHobbies() {
		return hobbies;
	}


	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getPresonal_id() {
		return presonal_id;
	}


	public void setPresonal_id(int presonal_id) {
		this.presonal_id = presonal_id;
	}


	/**
	 * @param firstName
	 * @param lastName
	 * @param mobile
	 * @param email
	 * @param hobbies
	 * @param description
	 * @param nationality
	 * @param gender
	 */
	public Personal(String firstName, String lastName,String gender, String mobile, String email, String hobbies, String description,
			String nationality ) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.mobile = mobile;
		this.email = email;
		this.hobbies = hobbies;
		this.description = description;
		this.nationality = nationality;
		this.gender = gender;
	}
	

	/**
	 * @param firstName
	 * @param lastName
	 * @param mobile
	 * @param email
	 * @param hobbies
	 * @param description
	 * @param nationality
	 * @param gender
	 * @param presonal_id
	 */
	public Personal(int presonal_id,String firstName, String lastName,  String gender, String mobile, String email, String hobbies, String description,
			String nationality) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.mobile = mobile;
		this.email = email;
		this.hobbies = hobbies;
		this.description = description;
		this.nationality = nationality;
		this.gender = gender;
		this.presonal_id = presonal_id;
	}

	/**
	 * 
	 */
	public Personal() {
	}


	@Override
	public String toString() {
		return "Personal [firstname=" + firstname + ", lastname=" + lastname + ", mobile=" + mobile + ", email=" + email
				+ ", hobbies=" + hobbies + ", description=" + description + ", nationality=" + nationality + ", gender="
				+ gender + ", presonal_id=" + presonal_id + "]";
	}
	
}
