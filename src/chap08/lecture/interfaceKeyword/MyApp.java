package chap08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
		
		Pet p1 = new Cat();
		Pet p2 = new malamute();
		
		p1.sit();
		p2.sit();
		
//		Malamute catl = (Malamute) p1; //캣은 말라뮤트다 라고 했기 때문에 오류 발생.
		
		Cat catl = (Cat) p1;
		Malamute mall = (Malamute) p2;
		
		System.out.println(p1 instanceOf Cat);
		System.out.println(p1 instanceOf KindaCat);
		System.out.println(p1 instanceOf Pet);
	}

}
