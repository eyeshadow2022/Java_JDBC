package c2_module06;

//M6草系Pokemon

public class GrassPokemon extends Pokemon {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GrassPokemon(String name, double height, double weight, String abilities, String category, String gender,
			String type) {
		super(name, height, weight, abilities, category, gender);
		this.type = type;
	}

	public GrassPokemon() {
		super();
		super.height=100;
		super.weight=50;
		super.getName();
	}

}
