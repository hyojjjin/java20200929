package chap09.textbook.s090401;

public class Button {
	OnClickListener listener;
	
	void setOnClickLisener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener { //관련되어있다는 것을 표시.
		void onClick();
	} 

}
