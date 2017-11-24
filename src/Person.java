
public class Person {
	
	private String name;
	private Integer age;
	private String cpf;
	
	public Person() {
	
	}
	public Person(String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return this.age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	/*public void say() {
		System.out.println("I'am saying something...");
	}
	
	public static String walk() {
		return "I'm walking...";
	}
	*/
}


