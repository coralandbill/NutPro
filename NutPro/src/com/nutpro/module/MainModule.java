package com.nutpro.module;

import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

@Modules(scanPackage=true)
@IocBy(type=ComboIocProvider.class,args={
	"*json","ioc/",
	"*annotation","net.xmf.nutz"
})
public class MainModule {

}
