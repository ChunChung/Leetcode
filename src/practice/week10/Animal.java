package practice.week10;

public interface Animal {
	public void walk();
}

class Dog implements Animal {
	@Override
	public void walk() {
		System.out.println("Dog Walk");
	}
}

class Cat 