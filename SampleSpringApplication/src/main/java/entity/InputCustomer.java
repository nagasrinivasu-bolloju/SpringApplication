package entity;

public class InputCustomer
{
	private Integer cusId;
	private String name;
	public InputCustomer() {
		 
	}
	public InputCustomer(int id, String name) {
		 
		this.cusId = id;
		this.name = name;
	}
	
	public int getId() {
		return cusId;
	}
	public void setId(int id) {
		this.cusId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
