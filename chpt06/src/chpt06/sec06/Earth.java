package chpt06.sec06;

public class Earth {
	//��� ���� �� �ʱ�ȭ
	static final double EARTH_RADIUS = 6371;
	
	//��� ����
	static final double EARTH_SURFACE_AREA;
	
	//Math.PI = �ڹٿ��� �����ϴ� ���
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * 2 * EARTH_RADIUS * EARTH_RADIUS ;
	}
}
