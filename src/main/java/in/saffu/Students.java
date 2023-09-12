package in.saffu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Students {

	private Integer sId;
	private String name;
	private String email;

	public Students() {
		super();

	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@PostConstruct
	public void init() {
		System.out.println("inside init method:-> beans craeted");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method :-> beans destroy");
	}

	@Override
	public String toString() {
		return "Students [sId=" + sId + ", name=" + name + ", email=" + email + "]";
	}

}
