package cc.notalk.foo.bean.custom.handler;

import cc.notalk.foo.bean.custom.parse.YuBeanDefinitionParse;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class YuNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		//注册自定义BeanDefinitionParse
		registerBeanDefinitionParser("user", new YuBeanDefinitionParse());
	}
}
