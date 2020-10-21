package chap09.textbook.s090401;

public class CallListener implements Button.OnClickListener {
	@Overrid
	pulic void onClick(){
		System.out.println("전화를 겁니다.");
	}

}
