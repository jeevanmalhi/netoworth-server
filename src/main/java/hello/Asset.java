package hello;


public class Asset {
	
	private String id;
	private String type;
	private String desc;
	private String ammount;
	
	
	public Asset(String id, String type, String desc, String ammount) {
		this.id = id;
		this.ammount = ammount;
		this.desc = desc;
		this.type = type;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getAmmount() {
		return ammount;
	}


	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

}	
