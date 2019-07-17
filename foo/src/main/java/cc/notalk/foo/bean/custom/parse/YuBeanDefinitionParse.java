package cc.notalk.foo.bean.custom.parse;

import cc.notalk.foo.bean.custom.Yu;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author notalk
 */
public class YuBeanDefinitionParse extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return Yu.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		super.doParse(element, builder);
		//获取name属性值
		String name = element.getAttribute("name");
		//获取address属性值
		String address = element.getAttribute("address");
		if (StringUtils.hasText(name)) {
			//赋值给bean对象
			builder.addPropertyValue("name", name);
		}
		if (StringUtils.hasText(address)) {
			builder.addPropertyValue("address", address);
		}
	}
}
