package Exam;

public class ShopService {
	private static ShopService singletone = new ShopService();
	private ShopService() {};
	
	//getInstance ����Ұ�...
	static ShopService getInstance() {
		return singletone;
	}
}
