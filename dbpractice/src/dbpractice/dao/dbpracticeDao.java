package dbpractice.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class dbpracticeDao {
	private DataSource dataSource;
	
	private dbpraticeDao() {
		try {
			Context initContext = new InitialContext();
		}catch(Exception){
			
		}
	}
}
