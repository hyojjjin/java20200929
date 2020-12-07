package chap11.textbook.s110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("chap11.textbook.s110603_newinstance.SendAction");
			Class clazz2 = Class.forName("chap11.textbook.s110603_newinstance.ReceiveAction");
			
			Action action = (Action) clazz.newInstance();
			action.execute();
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	catch (InstantiationException e) {
			e.printStackTrace();
		} 	catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
