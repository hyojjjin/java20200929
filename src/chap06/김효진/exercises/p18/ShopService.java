package chap06.김효진.exercises.p18;

public class ShopService {
	
	private static ShopService ss= new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return ss;
	}
	

}
