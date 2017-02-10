package springMybatis.util.LogUtil;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
 public class MyLogger{

		public void configureByXML(String url){
			this.getClass().getClassLoader();
			DOMConfigurator.configure(ClassLoader
					.getSystemResource(url));
		}
		
		public void configureByProperty(String url){
			this.getClass().getClassLoader();
			PropertyConfigurator.configure(ClassLoader
					.getSystemResource(url));
		}
}