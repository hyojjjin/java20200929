package chap06.lecture.textbook.s061005;

	public class Singleton {
		private static Singleton singleton = new Singleton();

		private Singleton() {}
	
		static Singleton getInstance() {
			return singleton;
		}
}
