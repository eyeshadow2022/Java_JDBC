package c2_module08;

//M8草系Pokemon

import c2_module06.Pokemon;

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
		super.setWeight(50);
		
	}
 @Override //告訴IDE此方法為複寫的方法
 //要求IDE代為檢查
public void setHeight(double height) {
	 if (height<0) {
			System.out.println("身高錯誤");
			super.height = 0.7;
			return;
		}else if(height>20) {
			System.out.println("過於巨大");
			super.height=10;
			return;
		}
		super.height = height;
 	}
 
 
}
