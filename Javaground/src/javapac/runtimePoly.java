package javapac;

public abstract class runtimePoly {
	public void speak(){
		System.out.print("Base sound");
	}
	 static void stafunc() {
		System.out.println("Iam a static function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runtimePoly rover = new dog();
		rover.speak();
		rover.stafunc();
		runtimePoly.stafunc();
		runtimePoly rtp = new dog();
		rtp.stafunc();
		runtimePoly spitter = new cat();
		spitter.speak();

	}

}

 class dog extends runtimePoly{
	 public void speak() {
	 System.out.print("Woof woof");
	 }
	
}
 class cat extends runtimePoly{
	 public void speak() {
	 System.out.print("Miao miao");
	 }
	
}
