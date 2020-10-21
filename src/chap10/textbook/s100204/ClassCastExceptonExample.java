package chap10.textbook.s100204;

public class ClassCastExceptonExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		change(cat);
	}
	
	public static void changeDog(Animal animal) {
		//if(aminal instanceof Dog) {
		Dog dog = (Dog) animal;
		//}
	}
}

class Animal {}
class Dog extends Animal{}	
class Eat extends Animal{}
