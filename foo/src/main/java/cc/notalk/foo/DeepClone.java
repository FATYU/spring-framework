package cc.notalk.foo;

import org.springframework.util.SerializationUtils;

import java.io.Serializable;

public class DeepClone implements Serializable, Cloneable {
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private Person person;


	public DeepClone getDeepClone() {
		return deepClone;
	}

	public void setDeepClone(DeepClone deepClone) {
		this.deepClone = deepClone;
	}

	private DeepClone deepClone;

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("person ");

		DeepClone dc = new DeepClone();
		person.setDc(dc);
		dc.setPerson(person);
		dc.setDeepClone(dc);


		DeepClone clone = (DeepClone) SerializationUtils.deserialize(SerializationUtils.serialize(dc));
		clone.getPerson().setName("clone person");
		System.out.println(dc.getPerson());
		System.out.println(clone.getPerson());

		System.out.println(dc);
		System.out.println(clone);
		System.out.println(dc.getDeepClone().toString());
		System.out.println(clone.getDeepClone().toString());
	}
}

/**
 * 深度拷贝
 */
class Person implements Serializable, Cloneable {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeepClone getDc() {
		return dc;
	}

	public void setDc(DeepClone dc) {
		this.dc = dc;
	}

	private String name;
	private DeepClone dc;


	@Override
	public String toString() {
		return "The Person instance hashCode is [" + this.hashCode() + "],name is [" + this.getName() + "]";
	}
}