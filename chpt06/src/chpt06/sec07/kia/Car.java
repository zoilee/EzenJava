package chpt06.sec07.kia;

import chpt06.sec07.hankook.*;
import chpt06.sec07.kumho.*;
public class Car {
	public static void main(String[]args) {
		chpt06.sec07.hankook.Tire tire1 = new chpt06.sec07.hankook.Tire();
		chpt06.sec07.kumho.Tire tire2 = new chpt06.sec07.kumho.Tire();
		SnowTire tire3 = new SnowTire();
		AllSeasonTire tire4 = new AllSeasonTire();
		tire1.view();
		tire2.view();
		tire3.view();
		tire4.view();
	}
}
