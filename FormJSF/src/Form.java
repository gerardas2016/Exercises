import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "form")
@SessionScoped

public class Form {
	
	private String name;
	private String surname;
	private String countryCode;
	private String email;
	private String [] list;
	private String phone;
	private String gender;
	

	
	
	
	
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gendere) {
		this.gender = gendere;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Form() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getList() {
		return list;
	}
	public void setList(String[] list) {
		this.list = list;
	}
	
	public void onSelectCountry(ValueChangeEvent vc) {

		Object oval = vc.getOldValue();
		Object nval = vc.getNewValue();

		System.out.println("old value" + oval);
		System.out.println("new value" + nval);

		if (nval != null) {
			countryCode = (String) nval;

		}

	
	}
}
