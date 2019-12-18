import cc.notalk.foo.bean.Bean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

public class SpringTests {
	@Test
	public void testLoadBean() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		//通过beanfactory获取bean对象
		Bean bean = (Bean) bf.getBean("beanName");
		Assert.notNull(bean);
	}
}
