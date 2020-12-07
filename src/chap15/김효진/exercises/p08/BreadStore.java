package chap15.김효진.exercises.p08;

class Bread {
	private int barcode;
	private int price;
	
	public Bread(int barcode, int price) {
		this.barcode = barcode;
		this.price = price;
	}
	
	// 같은 바코드 = 같은 빵 종류 = 같은 빵
	// 바코드가 같으면 같은 빵
	
	  public int hashCode() {
	  
	  return barcode;
	  
	  }
	 
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Bread) {
			return barcode == ((Bread) obj).barcode;
		}
		/*
		타입 타입
		
		두번째 바코드는 obj에서 꺼낸 바코드
		obj가 바코드일때
		
		
		같은 타입끼리 비교가 가능.
		같은 타입인 지 확인.
		같은 타입으로 맞춰주기.
		지금은 obj객체에서 꺼낸 필드니까.
		바코드로 변환
		
		*/
		

		
		return false;
	}
}

public class BreadStore {
	public static void main(String[] args) {
		Bread b1 = new Bread(110, 5000);
		Bread b2 = new Bread(110, 3000);
		
		System.out.println(b1 == b2); // 다른 객체, 다른 주소값
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
	}
}
