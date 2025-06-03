package DiamonShop.Entity;

public class Categorys {
	private int id;
	private String name;
	private String decription;
	
	public Categorys() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	@Override
	public String toString() {
		return "Categorys [id=" + id + ", name=" + name + ", decription=" + decription + "]";
	}
	
	
}
