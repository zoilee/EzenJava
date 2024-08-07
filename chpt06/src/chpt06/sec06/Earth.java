package chpt06.sec06;

public class Earth {
	//상수 선언 및 초기화
	static final double EARTH_RADIUS = 6371;
	
	//상수 선언
	static final double EARTH_SURFACE_AREA;
	
	//Math.PI = 자바에서 제공하는 상수
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * 2 * EARTH_RADIUS * EARTH_RADIUS ;
	}
}
