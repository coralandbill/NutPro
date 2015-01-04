package test;

import org.junit.Test;
import org.nutz.dao.Dao;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;


public class TestDataSource {

	@Test 
	public void test_dataSource(){
		JsonLoader jsonLoader = new JsonLoader("ioc/dataSource.js");
		NutIoc ioc = new NutIoc(jsonLoader);
		Dao dao = ioc.get(Dao.class);
		System.out.println("========dao:"+dao);
	}
}
