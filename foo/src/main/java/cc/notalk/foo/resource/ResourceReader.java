package cc.notalk.foo.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ResourceReader {


	public static void main(String[] args) {
		Resource resource = new ClassPathResource("foo.resource.file.xml");
		try {
			String scheme = resource.getURI().getScheme();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
