package javapac;

public class implementA implements interfaceA{

	public static void main(String[] args) {
		interfaceA.iCook("now");
		implementA impa = new implementA();
		impa.iCook("nothing");
		impa.iDrink();

	}

	public static void iCook(String name) {
		System.out.println("the name is :" +name);
		
	}

	@Override
	public void iDrink() {
		System.out.println("I drink coffee");
		
	}

}
