package cc.notalk.foo.bean;


public class Bean {

	private String beanName;

	public int getCreateTime() {
		return createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	private int createTime;

	public Bean() {
	}

	public Bean(String beanName, int createTime) {
		this.beanName = beanName;
		this.createTime = createTime;

	}


	public Bean(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}


}