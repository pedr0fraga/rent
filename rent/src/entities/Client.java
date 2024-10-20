package entities;

public class Client {
	private String name;
	private Integer code;
	private Integer room;

	public Client() {
	}

	public Client(String name, Integer code, Integer room) {
		super();
		this.name = name;
		this.code = code;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public Integer getRoom() {
		return room;
	}
	public String toString() {
		return "Cliente: " + name + "\nCódigo: " + code + "\nQuarto:" + room + "\n";
	}    

}
