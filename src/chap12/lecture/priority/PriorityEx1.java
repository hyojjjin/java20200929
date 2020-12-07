package chap12.lecture.priority;

public class PriorityEx1 {
	//여러개의 스레드를 만들어서 배열에 넣어두기
	public static void main(String[] args) {
		Thread[] = threads = new Thread[20];
		
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				public void run() {
					for(int i = 0; i < 20_0000_0000; i ++) {
					}
					System.out.println(getName() + "완료");
				};
			};
			for (i>10) {
			thread[i].setPtiority(10);
			//10과 가까운 것이 우선 순위
			} else {
				thread[i].setPtiority(1);
				//1~9까지는 아랫순위
			}
		}
		for (Thread t : threads) {
			t.start();
		}
	}

}
