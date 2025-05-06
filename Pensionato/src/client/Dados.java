package client;

public class Dados {
	
	private String name;
	private String emails;
	
	public Dados(String name, String emails) {
		this.name = name;
		this.emails = emails;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}
	
	public String toString() {
		return name + ", " + emails;
		
	}
	

}
