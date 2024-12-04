package Test;

abstract class Animal {

	public abstract void Sound();
 
	public static void walk() {
		System.out.println("hyghygg");
	}
	public void sleep() {
		System.out.println("cvb");
	}
}

class pig extends Animal {
	@Override
	public void Sound() {
		System.out.println("ah ah");
	}

	@Override
	public void sleep() {
		System.out.println("cvb");
	}
	//@Override
	public static void walk() {
		System.out.println("****");
	}

	public static void main(String args[]) {

		// Animal an=new Animal();
		Animal pg = new pig();
		pg.sleep();
		pg.walk();
	}
}