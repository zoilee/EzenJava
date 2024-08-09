package Exam;

public class ShopService {
	private static ShopService singletone = new ShopService();
	private ShopService() {};
	
	//getInstance 기억할것...
	static ShopService getInstance() {
		return singletone;
	}
}
