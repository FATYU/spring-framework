import cc.notalk.foo.bean.custom.Yu;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CustomTagTests {
	@Test
	public void beanLoadTest() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("yu.xml"));
		Yu yu = (Yu) bf.getBean("1");
		Assert.assertEquals(yu.getAddress(), "hz");
		Assert.assertEquals(yu.getName(), "zy");
		System.out.println(yu.getName() + "@" + yu.getAddress());
	}
}
