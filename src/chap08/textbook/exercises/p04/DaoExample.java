package chap08.textbook.exercises.p04;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		//(DataAccessObject dao) (파라미터 타입 파라미터 명)
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
