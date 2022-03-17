package c2_module06;

public class M6_Test {

	public static void main(String[] args) {
		Pokemon p1= new Pokemon();
		p1.setAbilities("茂盛");
		p1.setCategory("種子");
		p1.setGender("male");
		p1.setName("妙蛙種子");
		p1.setHeight(0.7);
		p1.setWeight(6.9);
	//	System.out.println(p1.getHeight());
	//	System.out.println(p1.getWeight());
		Pokemon p2 = new Pokemon("妙蛙草",-100, 100,"茂盛","種子","male");
		System.out.println(p2.getHeight());
		GrassPokemon gp = new GrassPokemon ();	
		
	}

}
