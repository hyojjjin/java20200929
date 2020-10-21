package chap09.textbook.s090401;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new (callListener();)
				
		
		btn.setOnClickListener(new Calllistener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
