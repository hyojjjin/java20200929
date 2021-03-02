package chap06.김효진.exercises2.p18;

public class ShopService {

	//정적필드
	//생성자
	//정적메소드
	
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}
	public static ShopService getInstance() {
		return shopService;
	}
}
