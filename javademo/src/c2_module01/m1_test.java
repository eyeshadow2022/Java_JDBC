package c2_module01;

public class m1_test {

	public static void main(String[] args) {
		Pokemon 大麻種子 = new Pokemon();
		大麻種子.name="妙蛙種子";
		大麻種子.height=0.7;
		大麻種子.weight=6.9;
		大麻種子.abilities="茂盛";
		大麻種子.category="seed";
		大麻種子.gender="male";
		Pokemon 大麻種子2 = new Pokemon();
		大麻種子2.name="妙蛙種子2";
		大麻種子2.height=0.7;
		大麻種子2.weight=6.9;
		大麻種子2.abilities="茂盛";
		大麻種子2.category="seed";
		大麻種子2.gender="male";
//		愛吃鬼 巧達 = null;
//		巧達.吃飯();
		
		Pokemon 大麻種子3 =大麻種子;
		System.out.println(大麻種子==大麻種子2); //0
		System.out.println(大麻種子==大麻種子3); //1
		System.out.println(大麻種子2==大麻種子3); //0
		
		Pokemon 大麻 = new Pokemon();
		大麻.name="妙蛙草";
		大麻.height=1.0;
		大麻.weight=13;
		大麻.abilities="非常茂盛";
		大麻.category="Weeeeeed";
		大麻.gender="male";
		
		System.out.println(大麻種子==大麻);
		Pokemon[] pokemonList = new Pokemon[4];
		pokemonList[0]=大麻;
		pokemonList[1]=大麻種子;
		pokemonList[2]=大麻種子2;
		pokemonList[3]=大麻種子3;
		
		
		
//		大麻=null;
//		大麻種子=null;
//		大麻種子2=null;
//		大麻種子3=null;
//		System.gc();
//		大麻種子3.height=100;
		
	}

}
