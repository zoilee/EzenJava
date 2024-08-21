package chpt13.sec01;

public class HomeAgency implements Rentable<House>{

	@Override
	public House rent() {
		
		return new House();
	}

}
