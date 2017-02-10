package springMybatis.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryManager {
	private static ApplicationContext ctx;
	public static Object getBean(String beanName){
		return ctx.getBean(beanName);
	}
	public static void init(String beanXmlUrl){
		ctx = new ClassPathXmlApplicationContext(beanXmlUrl);
	}

}
