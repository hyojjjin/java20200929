package chap06.김효진.exercises2.p18;

public class ShopServiceExample {
	public static void main(String[] args) {
		//ShopService 객체를 싱글톤으로 만들기
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}
