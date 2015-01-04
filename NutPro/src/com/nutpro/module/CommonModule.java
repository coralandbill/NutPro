package com.nutpro.module;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean
public class CommonModule {

	@Inject
	private Dao dao;
}
