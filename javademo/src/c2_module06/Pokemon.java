package c2_module06;

public class Pokemon {//類別
	//建立屬性
	private String name; 
	protected double height; //同 package or 子類別可以存取
	double weight;  //同 package
	private String abilities; // 完全私有
	private String category;
	private String gender;
	

	public Pokemon() {
		super();
	}

	public Pokemon(String name, double height, double weight, 
			String abilities, String category, String gender) {
		super();
		setName(name);
		setHeight(height);
		setWeight(weight);
		setAbilities(abilities);
		setCategory(category);
		setGender(gender);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height<0) {
			System.out.println("身高錯誤");
			this.height = 0.7;
			return;
		}
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if (weight<0) {
			System.out.println("體重錯誤");
			this.weight = 6.9;
			return;
		}
		this.weight = weight;
	}
	public String getAbilities() {
		return abilities;
	}
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	//getter setter
}
