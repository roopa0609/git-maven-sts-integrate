package ex.inhertiance;

import java.sql.Timestamp;

public class B extends A {

	int y=20;
	
	B(){
		System.out.println("Inside B Constructor y = "+y);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Inside B Constructor Time = "+timestamp);
	}
}